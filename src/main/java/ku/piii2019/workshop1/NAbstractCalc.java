/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ku.piii2019.workshop1;

/**
 *
 * @author fahim
 */
public class NAbstractCalc {

    public NAbstractCalc() {
        this.myNParameterCalc = myNParameterCalc;
    }
    
     public NAbstractCalc(NParameterCalc myNParameterCalc) {
        this.myNParameterCalc = myNParameterCalc;
    }
    
    NParameterCalc  myNParameterCalc;
    
    int doYourSum(NParameterCalc c, int[] numbers) {   
        return c.SumCalc(numbers);
    }

    int doMySum(int[] numbers) {   
        return myNParameterCalc.SumCalc(numbers);
    }
    
     int doYourRange(NParameterCalc c, int a, int b) {  
        return c.RangeCalc(a, b);
    }

    int doMyRange(int a, int b) { 
        return myNParameterCalc.RangeCalc(a, b);
    }
    
}
