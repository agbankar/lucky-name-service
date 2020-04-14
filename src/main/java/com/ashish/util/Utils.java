package com.ashish.util;

import com.ashish.exception.AppExceptionHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    private static final Logger logger = LogManager.getLogger ( AppExceptionHandler.class );

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "d/MM/yyyy" );


    public static LocalDate getFormattedDob ( String dateofBirth ) {
        logger.info ( "Converting string to date "+dateofBirth ) ;

        return LocalDate.parse ( dateofBirth, formatter );

    }

    public static int getdobAsNumber ( LocalDate dateofBirth ) {
        logger.info ( "Converting date to Number "+dateofBirth ) ;

        String builder = String.valueOf ( dateofBirth.getDayOfMonth () ) +
                dateofBirth.getMonthValue () +
                dateofBirth.getYear ();
        return Integer.parseInt ( builder );
    }

    public static <T> boolean exists ( T t ){
        return null != t;

    }
}
