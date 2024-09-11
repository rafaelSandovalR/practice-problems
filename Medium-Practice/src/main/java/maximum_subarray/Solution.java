/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_subarray;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxSubArray(int[] nums){
        int max = nums[0];
        int ptr = 1;
        int current = nums[0];
        
        while (ptr < nums.length){
            
            /**
             * Reset current sum of sub-array if:
             *  1) The next number is larger than the current sum
             * AND
             *  2) The current sum is a negative number
             */
            
            // You can also represent this like:
            // current = Math.max(nums[ptr] + current , nums[ptr])
            // In other words, does the previously calculated sum positively contribute to the current number?
            if (nums[ptr] > current && current < 0){
                current = 0;
            }
            current += nums[ptr++]; // Add the next number to the current sum
            max = Math.max(max, current); // Check if new sum is larger than the max
         
        }
        
        return max;
    }
}
