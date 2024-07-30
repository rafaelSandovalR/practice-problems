/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_sum;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[] twoSum(int[] nums, int target){
        
        int[] answer = new int[2];
        Arrays.sort(nums);
        
        for(int i = 0, j = nums.length - 1; i < j;){
            
            if(nums[i] + nums[j] == target){
                answer[0] = i;
                answer[1] = j;
            }
            
            if (nums[i] + nums[j] < target){
                i++;
            } else{
                j--;
            }
        }
        
        return answer;
    }
}
