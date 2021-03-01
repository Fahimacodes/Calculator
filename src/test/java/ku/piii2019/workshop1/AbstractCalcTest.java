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
public class AbstractCalcTest {

    public AbstractCalcTest() {
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
     * Test of doYourCalc method, of class AbstractCalc.
     */
    @Test
    public void testDoYourCalc() {
        
        TwoParameterCalc myMultiplyCalc =  (int a1, int b1) -> a1 * b1; 
        
        AbstractCalc myModuloCalc = new AbstractCalc((int a, int b) -> a % b);

        System.out.println("doYourCalc");
        int a = 2;
        int b = 2;
        TwoParameterCalc c = new AdditionCalc();
        AbstractCalc instance = new AbstractCalc();
        int expResult = 1;
        int result = instance.doYourCalc(a, b, (int a1, int b1) -> a1 / b1);
        //(int a1, int b1) -> a1 / b1
        assertEquals(expResult, result);
    }

    
    /**
     * Test of doMyCalc method, of class AbstractCalc.
     */
    @Test
    public void testDoMyCalc() {
        System.out.println("doMyCalc");
        int a = 0;
        int b = 0;
        AbstractCalc instance = new AbstractCalc();
        int expResult = 0;
        int result = instance.doMyCalc(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
