/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_sum_circular_subarray;

/**
 *
 * @author Rsand
 * 
 * Solution using minimum subarray calculation to find wrap-around sum
 */
public class Solution2 {
    public int maxSubarraySumCircular(int[] nums){
        
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        int totalSum = nums[0];
        
        // Iterate through the array from the second element
        for (int i = 1; i < n; i++){
            totalSum += nums[i]; // Update running sum
            
            // Update the current max/min sums: either start a new subarray at the current element or extend the existing ones
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            
            max = Math.max(max, currentMax);
            min = Math.min(min,currentMin);
            
            
        }
        
        // If the total sum is equal to the minimum sum, it means all elements are negative. In this case, return the maximum sum
        // Otherwise, the maximum circular subarray sum is either the maximum subarray sum or the total sum minus the minimum subarray sum
        return totalSum == min ? max : Math.max(totalSum - min, max);
    }
}
