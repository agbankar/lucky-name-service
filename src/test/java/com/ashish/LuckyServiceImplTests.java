package com.ashish;


import com.ashish.service.LuckyServiceImpl;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;


import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LuckyServiceImplTests {
    @InjectMocks
    LuckyServiceImpl service = new LuckyServiceImpl ();
    @Mock
    Map<Character, Integer> charValuesMap = new HashMap<> ();
    @Mock
    Map<Character, Integer> vowelsMap = new HashMap<> ();
    @Rule
    
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void testService () {
       this. initMocks ();
        Assert.assertNotNull ( service.checkLuckyName ( "ASHISH", "01/12/2019" ) );
        final String s1= "";


    }
    private void initMocks () {
        when ( charValuesMap.get ( 'A' ) ).thenReturn ( 1 );
        when ( charValuesMap.get ( 'B' ) ).thenReturn ( 2 );
        when ( charValuesMap.get ( 'C' ) ).thenReturn ( 3 );
        when ( charValuesMap.get ( 'D' ) ).thenReturn ( 4 );
        when ( charValuesMap.get ( 'E' ) ).thenReturn ( 5 );
        when ( charValuesMap.get ( 'F' ) ).thenReturn ( 6 );
        when ( charValuesMap.get ( 'G' ) ).thenReturn ( 7 );
        when ( charValuesMap.get ( 'H' ) ).thenReturn ( 8 );
        when ( charValuesMap.get ( 'I' ) ).thenReturn ( 9 );
        when ( charValuesMap.get ( 'J' ) ).thenReturn ( 10 );
        when ( charValuesMap.get ( 'K' ) ).thenReturn ( 11 );
        when ( charValuesMap.get ( 'L' ) ).thenReturn ( 12 );
        when ( charValuesMap.get ( 'M' ) ).thenReturn ( 13 );
        when ( charValuesMap.get ( 'N' ) ).thenReturn ( 14 );
        when ( charValuesMap.get ( 'O' ) ).thenReturn ( 15 );
        when ( charValuesMap.get ( 'P' ) ).thenReturn ( 16 );
        when ( charValuesMap.get ( 'Q' ) ).thenReturn ( 17 );
        when ( charValuesMap.get ( 'R' ) ).thenReturn ( 18 );
        when ( charValuesMap.get ( 'S' ) ).thenReturn ( 19 );
        when ( charValuesMap.get ( 'T' ) ).thenReturn ( 20 );
        when ( charValuesMap.get ( 'U' ) ).thenReturn ( 21 );
        when ( charValuesMap.get ( 'V' ) ).thenReturn ( 22 );
        when ( charValuesMap.get ( 'W' ) ).thenReturn ( 23 );
        when ( charValuesMap.get ( 'X' ) ).thenReturn ( 24 );
        when ( charValuesMap.get ( 'Y' ) ).thenReturn ( 25 );
        when ( charValuesMap.get ( 'Z' ) ).thenReturn ( 26 );
        when ( charValuesMap.get ( 'Z' ) ).thenReturn ( 26 );


        when ( vowelsMap.containsKey ( 'A' ) ).thenReturn ( true );
        when ( vowelsMap.containsKey ( 'E' ) ).thenReturn ( true );
        when ( vowelsMap.containsKey ( 'I' ) ).thenReturn ( true );
        when ( vowelsMap.containsKey ( 'O' ) ).thenReturn ( true );
        when ( vowelsMap.containsKey ( 'U' ) ).thenReturn ( true );
    }

}

