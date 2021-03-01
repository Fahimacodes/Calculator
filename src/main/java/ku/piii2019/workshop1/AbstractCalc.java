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
public class AbstractCalc {

    TwoParameterCalc myTwoParameterCalc; // the field 

    public AbstractCalc() {
        this.myTwoParameterCalc = myTwoParameterCalc;
    }

    public AbstractCalc(int a, int b) {
        this.myTwoParameterCalc = myTwoParameterCalc;
    }

    AbstractCalc(TwoParameterCalc twoParameterCalc) {
        this.myTwoParameterCalc = myTwoParameterCalc;
    }

    int doYourCalc(int a, int b, TwoParameterCalc c) { //first method  
        return c.getAnswer(a, b);
    }

    int doMyCalc(int a, int b) { //second method  
        return myTwoParameterCalc.getAnswer(a, b);
    }

    static class SubtractCalc implements TwoParameterCalc {

        @Override
        public int getAnswer(int a, int b) {
            return a - b;
        }
    }

}
