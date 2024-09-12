/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_sum_circular_subarray;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxSubarraySumCircular(int[] nums){

        int n = nums.length;
        int[] rightMax = new int[n]; // Array to hold max suffix sums at each index
        rightMax[n-1] = nums[n-1]; // Set the last sum as the last number in nums
        int currentSum = nums[n-1]; // Calculates running sum at each index
        
        // Iterate nums in reverse order
        for (int i = n-2; i >= 0; i--){
            currentSum += nums[i]; // Add current number to runnign sum
            rightMax[i] = Math.max(currentSum, rightMax[i+1]); // The max of the current sum or the previous max
        }
        
        // Calculate max subarray (Kadane's algorithm) as well as each wrap around sums
        
        currentSum = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < n; i++){
            
            // Kadane's algorithm
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            max = Math.max(max, currentSum);
        }
        
        return 0;
    }
}
