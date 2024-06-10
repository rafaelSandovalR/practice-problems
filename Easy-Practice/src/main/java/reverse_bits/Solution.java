/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse_bits;

/**
 *
 * @author Rsand
 */
public class Solution {
    // Treat n as an unsigned value
    public int reverseBits(int n){
        int result = 0;
        
        for (int i = 0; i < 32; i++){
            result <<= 1; // Shift result left by 1 to make space for the next bit on the right
            result |= (n & 1);  // Get the rightmost bit of n and add it to the result
            n >>= 1; // Shift n right by 1
        }
        return result;
    }
}
