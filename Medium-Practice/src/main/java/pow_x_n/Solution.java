/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pow_x_n;

/**
 *
 * @author Rsand
 */
public class Solution {
    public double myPow(double x, long n){
        
        // Base case: Any number raised to the power of 0 is 1
        if (n == 0) return 1;
        
        // Handle negative exponents: x^-n = 1 / x^n
        if (n < 0) return 1 / myPow(x, -n);
        
        // If n is odd
        if (n % 2 == 1) return x * myPow(x, n - 1);
        
        // If n is even
        return myPow(x * x, n / 2);
    }
}
