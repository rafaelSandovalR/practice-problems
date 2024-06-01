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
            if (nums[ptr] > current) current = 0;
            current += nums[ptr++];
            max = Math.max(max, current);
         
        }
        
        return max;
    }
}
