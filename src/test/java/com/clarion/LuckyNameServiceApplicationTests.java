package com.clarion;


import com.clarion.service.LuckyService;
import com.clarion.service.LuckyServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;


import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LuckyNameServiceApplicationTests {
    public MockitoRule rule = MockitoJUnit.rule ().strictness ( Strictness.LENIENT );
    @InjectMocks
    LuckyService service = new LuckyServiceImpl ();
    @Mock
    Map<Character, Integer> charValuesMap = new HashMap<> ();
    @Mock
    Map<Character, Integer> vowelsMap = new HashMap<> ();

    @Test
    public void testService () throws ParseException {
        when ( charValuesMap.get ( 'A' ) ).thenReturn ( 1 );
        when ( charValuesMap.get ( 'S' ) ).thenReturn ( 19 );
        when ( charValuesMap.get ( 'H' ) ).thenReturn ( 8 );
        when ( charValuesMap.get ( 'I' ) ).thenReturn ( 9 );
    //THIS IS NOT IMPLEMENTED FULLY
        Assert.assertNotNull ( service.checkLuckyName ( "ASHISH", "01/12/2019" ) );

    }

}
