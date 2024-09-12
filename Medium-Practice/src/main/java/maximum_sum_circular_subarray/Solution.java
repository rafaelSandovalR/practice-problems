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
        int current = nums[0];
        int max = nums[0];
        
        
        for (int i = 1, j = n-1, count = 1; count < n; count++){
            
            int rightSum = current + nums[i];
            int leftSum = current + nums[j];
            
            if (rightSum >= leftSum && rightSum >= nums[i]){
                current = rightSum;
                i++;
            } else if (leftSum >= nums[j] && leftSum >= nums[j]){
                current = leftSum;
                j--;
            } else{
                
                if (nums[i] == nums[j]){
                    if (rightIsBiggerOrEqual(nums, i , j)){
                        current = nums[i];
                        j = i - 1;
                        i++;
                    } else {
                        current = nums[j];
                        i = j + 1;
                        j--;
                    }
                } else if (nums[i] > nums[j]){
                    current = nums[i];
                    j = i - 1;
                    i++;
                } else {
                    current = nums[j];
                    i = j + 1;
                    j--;
                }  
            }
           
            
            max = Math.max(max, current);
            
            i = (i + n) % n;
            j = (j + n) % n;
        }
        
        return max;
    }
    
    private boolean rightIsBiggerOrEqual(int[] nums, int i, int j){
        int n = nums.length;
        
        int leftMax = 0;
        int leftCurrent = 0;
        int rightMax = 0;
        int rightCurrent = 0;
        
        while (i != j){
            
            rightCurrent += nums[i];
            leftCurrent += nums[j];
            
            rightMax = Math.max(rightCurrent, rightMax);
            leftMax = Math.max(leftCurrent, leftMax);
            
            i++;
            j--;
            
            i = (i + n) % n;
            j = (j + n) % n;
        }
        
        return rightMax >= leftMax;
    }
}
