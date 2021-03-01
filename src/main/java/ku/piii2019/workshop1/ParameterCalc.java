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
public class ParameterCalc implements NParameterCalc {

    @Override
    public int SumCalc(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;
    }

    @Override
    public int RangeCalc(int a, int b) {
        return Math.abs(a - b);
    }

}
