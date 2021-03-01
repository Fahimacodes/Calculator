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
public interface Calculator {
    
    int add(int a, int b);// simply add together two numbers
    int divide(int num, int denom);// integer division
    int getPercentage(float amount, float total);
    // getPercentagereturns a rounded down integer, e.g:
    // amount= 0.259, total = 1.0: returns 25
    // amount = 300.0, total = 900.0: returns 33
    
    
}
