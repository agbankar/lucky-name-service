package com.ashish.controller;

import com.ashish.aspect.LoggingAspect;
import com.ashish.model.LuckyResponse;
import com.ashish.service.LuckyService;
import com.ashish.util.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import java.text.ParseException;


@RestController
@RequestMapping("/api")
public class LuckyNameController {
    @Autowired
    private LuckyService service;

    private static final String NAME_REGEX = "[a-zA-Z]+";
    private static final int MIN_LENGTH = 3;

    private static final Logger logger = LogManager.getLogger( LoggingAspect.class);
    @GetMapping("/checkLuck")

    public ResponseEntity<LuckyResponse> checkLuckyName ( @RequestParam
                                                                  String name,
                                                          @RequestParam String dob ) throws ParseException {
        logger.debug ( "Processing request for Name :"+ name +"DOB : "+dob);
        this.validateRequest ( name, dob );
        return ResponseEntity.ok ( service.checkLuckyName ( name, dob ) );
    }


    private void validateRequest ( final String name, final String dob ) {
        logger.info ( "Inside Validation");

        if (!Utils.exists ( name )) {
            logger.debug ( "Bad Request with Name");

            throw new ConstraintViolationException ( "", null );
        }
        if (name.length ()<MIN_LENGTH) {
            logger.debug ( "Bad Request with Name");
            throw new ConstraintViolationException ( "", null );
        }
        else if (!name.matches ( NAME_REGEX )) {
            throw new ConstraintViolationException ( "", null );
        }
        Utils.getFormattedDob ( dob );

    }

    public LuckyService getService () {
        return service;
    }


}
