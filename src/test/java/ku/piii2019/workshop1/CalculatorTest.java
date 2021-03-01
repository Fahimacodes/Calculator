/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.workshop1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;

/**
 *
 * @author fahim
 */
public class CalculatorTest {
    //static test case used with @BeforeClass     
    public static Calculator instance; 
 
    public CalculatorTest(){ }
    
    @Before
    public void setUpClass() {
       // uncomment the class you want to use - only done once       
       //  instance = new CalculatorImpl();       
       //instance = new BrokenPercentageCalculator();       
        instance = new BrokenAddCalculator(); 
    }

    @Before
    public void setUp() {
        //  instance = new BrokenPercentageCalculator();
    }

    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add broken");
        int a = -2;
        int b = -2;
        instance = new BrokenAddCalculator();
        int expResult = -4;
        int result = instance.add(a, b);           
        assertEquals(expResult, result);
        
         System.out.println("add working");
        a = 2;
        b = 2;
        instance = new WorkingCalculator();
        expResult = 4;
        result = instance.add(a, b);           
        assertEquals(expResult, result);
    }
    // BrokenAddCalculator() WorkingCalculator() BrokenPercentageCalculator()

    /**
     * Test of divide method, of class Calculator.
     */
    @org.junit.Test
    public void testDivide() {
        System.out.println("divide");
        int num = 4;
        int denom = 2;
        instance = new WorkingCalculator();
        int expResult = 2;
        int result = instance.divide(num, denom);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPercentage method, of class Calculator.
     */
    @org.junit.Test
    public void testGetPercentage() {
        System.out.println("getPercentage working");
        float amount = 100.0F;
        float total = 100.0F;
        instance = new WorkingCalculator();
        int expResult = 100;
        int result = instance.getPercentage(amount, total);
        assertEquals(expResult, result);

        System.out.println("getPercentage broken");
        amount = 100.0F;
        total = 100.0F;
        instance = new BrokenPercentageCalculator();        
        expResult = 100;
        int result2 = instance.getPercentage(amount, total);
        assertEquals(expResult, result);
        
            if (result2 != result){
                System.out.println("getPercentage broken right");
                assertNotEquals(expResult, result);
            } else {
                System.out.println("getPercentage broken wrong");
                assertEquals(expResult, result);
            }
            }
    }

