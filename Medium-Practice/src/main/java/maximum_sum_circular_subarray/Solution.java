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
        
        int start = 0;
        int maxEnd = 0;
        int maxStart = 0;
        
        for (int i = 1; i < n; i++){
            
            if (current + nums[i] > nums[i]){
                current += nums[i];
            } else {
                current = nums[i];
                start = i;
            }
            
            if (current > max){
                max = current;
                maxStart = start;
                maxEnd = i;
            }
            
        }
        
        int prev = (maxStart - 1 + n) % n;
        int max2 = 0;
        current = 0;
        
        for (int i = prev; i != maxEnd;){
            current += nums[i];
            max2 = Math.max(current, max2);
            i--;
            i += n;
            i %= n;
        }
        
        return Math.max(max, max + max2);
    }
}
