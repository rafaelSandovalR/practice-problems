/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_sum_circular_subarray;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int maxSubarraySumCircular(int[] nums){
        
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        int totalSum = nums[0];
        
        for (int i = 1; i < n; i++){
            totalSum += nums[i];
            
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            
            max = Math.max(max, currentMax);
            min = Math.min(min,currentMin);
            
            
        }
        
        return totalSum == min ? max : Math.max(max - min, max);
    }
}
