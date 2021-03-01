/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.workshop1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fahim
 */
public class NAbstractCalcTest {
    
    public NAbstractCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doYourSum method, of class NAbstractCalc.
     */
    @Test
    public void testDoYourSum() {
        System.out.println("doYourSum");
        NParameterCalc c = null;
        int[] numbers = null;
        NAbstractCalc instance = new NAbstractCalc();
        int expResult = 0;
        int result = instance.doYourSum(c, numbers);
        assertEquals(expResult, result);       
      
    }

    /**
     * Test of doMySum method, of class NAbstractCalc.
     */
    @Test
    public void testDoMySum() {
        System.out.println("doMySum");
        int[]numbers = null;
        NAbstractCalc instance = new NAbstractCalc();
        int expResult = 0;
        int result = instance.doMySum(numbers);
        assertEquals(expResult, result);
    }

    /**
     * Test of doYourRange method, of class NAbstractCalc.
     */
    @Test
    public void testDoYourRange() {
        System.out.println("doYourRange");
        NParameterCalc c = null;
        int a = 0;
        int b = 0;
        NAbstractCalc instance = new NAbstractCalc();
        int expResult = 0;
        int result = instance.doYourRange(c, a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of doMyRange method, of class NAbstractCalc.
     */
    @Test
    public void testDoMyRange() {
        System.out.println("doMyRange");
        int a = 0;
        int b = 0;
        NAbstractCalc instance = new NAbstractCalc();
        int expResult = 0;
        int result = instance.doMyRange(a, b);
        assertEquals(expResult, result);
       
    }
}
