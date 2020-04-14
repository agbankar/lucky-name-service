package com.ashish.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger logger = LogManager.getLogger ( AppExceptionHandler.class );

    @ExceptionHandler(ConstraintViolationException.class)
    public final ResponseEntity<AppExceptionResponse> handleConstraintViolationException ( ConstraintViolationException ex ) {
        logger.debug ( ex.getStackTrace () );
        List<String> details = new ArrayList<> ();
        details.add ( ex.getLocalizedMessage () );
         AppExceptionResponse appExceptionResponse = new AppExceptionResponse ( "Only Alphabets are allowed , Min length 3. Please Check Name entered",
                details );
        return new ResponseEntity<> (
                appExceptionResponse, HttpStatus.BAD_REQUEST );
    }

    @ExceptionHandler(DateTimeParseException.class)
    public final ResponseEntity<AppExceptionResponse> handleDataFormatException ( DateTimeParseException ex ) {
        logger.debug ( ex.getStackTrace () );
        List<String> details = new ArrayList<> ();
        details.add ( ex.getLocalizedMessage () );
         AppExceptionResponse appExceptionResponse = new AppExceptionResponse ( "Date entered is not valid . Please enter the date in dd/mm/YYYY e.g. 10/01/1986 format",
                details );
        return new ResponseEntity<> (
                appExceptionResponse, HttpStatus.BAD_REQUEST );
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<AppExceptionResponse> handleException ( DateTimeParseException ex ) {
        logger.debug ( ex.getStackTrace () );

        List<String> details = new ArrayList<> ();
        details.add ( ex.getLocalizedMessage () );
         AppExceptionResponse appExceptionResponse = new AppExceptionResponse ( "Internal Server Error has occured ",
                details );
        return new ResponseEntity<> (
                appExceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR );
    }

}
