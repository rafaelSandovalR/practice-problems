/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plus_one;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[] plusOne(int[] digits){
               
        int n = digits.length;
        
        // Loop starting from end of array
        for (int i = n-1; i >= 0; i++){
            // Replace any 9s with 0
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            // If encounter any number < 9, increase by 1 and return array
            else{
                digits[i]++;
                return digits;
            }
        }
        
        // If no number < 9, then need to create an array with one more digit
        digits = new int[n+1];
        // Array should start with one and the rest zeroes
        digits[0] = 1;
        return digits;
    }
}
