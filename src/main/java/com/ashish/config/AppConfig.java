package com.ashish.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import java.util.HashMap;
import java.util.Map;
/*
@Author ashish
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    @Primary
    @Qualifier("charValuesMap")
    public Map<Character, Integer> charValuesMap () {
        Map<Character, Integer> charValuesMap = new HashMap<Character, Integer> ();
        charValuesMap.put ( 'A', 1 );
        charValuesMap.put ( 'B', 2 );
        charValuesMap.put ( 'C', 3 );
        charValuesMap.put ( 'D', 4 );
        charValuesMap.put ( 'E', 5 );
        charValuesMap.put ( 'F', 6 );
        charValuesMap.put ( 'G', 7 );
        charValuesMap.put ( 'H', 8 );
        charValuesMap.put ( 'I', 9 );
        charValuesMap.put ( 'J', 10 );
        charValuesMap.put ( 'K', 11 );
        charValuesMap.put ( 'L', 12 );
        charValuesMap.put ( 'M', 13 );
        charValuesMap.put ( 'N', 14 );
        charValuesMap.put ( 'O', 15 );
        charValuesMap.put ( 'P', 16 );
        charValuesMap.put ( 'Q', 17 );
        charValuesMap.put ( 'R', 18 );
        charValuesMap.put ( 'S', 19 );
        charValuesMap.put ( 'T', 20 );
        charValuesMap.put ( 'U', 21 );
        charValuesMap.put ( 'V', 22 );
        charValuesMap.put ( 'W', 23 );
        charValuesMap.put ( 'X', 24 );
        charValuesMap.put ( 'Y', 25 );
        charValuesMap.put ( 'Z', 26 );

        return charValuesMap;
    }
    @Bean
    @Qualifier("vowelsMap")
    public Map<Character, Integer> vowelsMapMap () {
        Map<Character, Integer> vowelsMap = new HashMap<Character, Integer> ();
        vowelsMap.put ( 'A', 1 );
        vowelsMap.put ( 'E', 5 );
        vowelsMap.put ( 'I', 9 );
        vowelsMap.put ( 'O', 15 );
        vowelsMap.put ( 'U', 21 );

        return vowelsMap;
    }
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor ();
    }
}
