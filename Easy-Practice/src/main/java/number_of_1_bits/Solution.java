/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number_of_1_bits;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int hammingWeight(int n){
        int result = 0;
        
        for (int i = 0; i < 32; i++){
            result += n & 1; // If rightmost bit is 1, add 1 to result
            n >>= 1; // Shift n to the right to get the next digit
        }
        return result;
    }
}
