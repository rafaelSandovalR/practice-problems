/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_sum_circular_subarray;

/**
 *
 * @author Rsand
 * 
 * Solution using prefix and suffix sums
 */
public class Solution {
    public int maxSubarraySumCircular(int[] nums){

        int n = nums.length;
        int[] rightMax = new int[n]; // Array to hold max suffix sums at each index
        rightMax[n-1] = nums[n-1]; // Set the last sum as the last number in nums
        int currentSum = nums[n-1]; // Holds running sum at each index from the end
        
        // Iterate through nums in reverse order
        for (int i = n-2; i >= 0; i--){
            currentSum += nums[i]; // Add current number to runnign sum
            rightMax[i] = Math.max(currentSum, rightMax[i+1]); // The max of the current sum or the previous max
        }
        
        // Calculate max subarray (Kadane's algorithm) as well as each wrap around sums
        
        int currentMax = 0; // Holds max sum at current index
        int max = nums[0]; // Holds max sum so far
        int maxWrapAround = nums[0]; // Holds max wrap-around sum so far
        int prefixSum = 0; // Running sum at each index from the start
        
        // Traverse the nums in order this time
        for (int i = 0; i < n; i++){
            
            // Kadane's algorithm
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            max = Math.max(max, currentMax);
            
            prefixSum += nums[i]; // Add current number to running sum
            
            // While there are still numbers ahead to calculate a wrap-around sum
            if (i+1 < n){
                // Check the wrap-around sum by adding the running sum (prefix) and the rightMax at the next index
                maxWrapAround = Math.max(maxWrapAround, prefixSum + rightMax[i+1]);
            }
        }
        
        return Math.max(max, maxWrapAround);
    }
}
