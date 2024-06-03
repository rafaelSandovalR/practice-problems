/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_subarray;

/**
 *
 * @author Rsand
 */
public class DivideAndConquer_Solution {
    public int maxSubArray(int[] nums){
        return maxSubArrayHelper(nums, 0, nums.length - 1);
    }
    
    private int maxSubArrayHelper(int[] nums, int left, int right){
        
        if (left == right) return nums[left];
        
        int mid = left + (right - left) / 2;
        
        int leftSum = maxSubArrayHelper(nums, left, mid);
        int rightSum = maxSubArrayHelper(nums, mid + 1, right);
        
        int crossSum = maxCrossingSum(nums, left, mid, right);
        
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
    
    private int maxCrossingSum(int[] nums, int left, int mid, int right){
        int leftMax = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--){
            sum += nums[i];
            leftMax = Math.max(leftMax, sum);
        }
        
        int rightMax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++){
            sum += nums[i];
            rightMax = Math.max(rightMax, sum);
        }
        
        return leftMax + rightMax;
    }
}
