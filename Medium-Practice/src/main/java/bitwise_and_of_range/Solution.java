/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitwise_and_of_range;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int rangeBitwiseAnd(int left, int right){
        int count = 0; // Counter to track the number of right shifts
        
        // Right shift both numbers until they become equal (converge to a common prefix)
        while (left != right){
            left >>= 1; // Right shift 'left' by 1 (divide by 2)
            right >>= 1;
            count++;
        }
        
        // 'left' now holds the common prefix. Left-shift it by 'count' to restore it to its original position
        return (left << count);
    }
    
    public int alt(int left, int right){
        
        while (right > left){
            // Clear the least significant set bit in 'right'
            right = right & (right - 1);
        }
        
        // 'right' now holds the common prefix which is the bitwise AND of all numbers in the range
        return right;
    }
}
