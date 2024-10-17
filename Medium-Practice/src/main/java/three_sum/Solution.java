/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List list = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        
        int mid = nums[left] + nums[right] < 0 ? right - 1 : 1;
        
        while (mid - 1 > left || mid + 1 < right){
            
            int sum = nums[left] + nums[mid] + nums[right];
            
            while (sum < 0 && mid < right - 1){
                sum = nums[left] + nums[++mid] + nums[right];
            }
            
            while (sum > 0 && mid > left + 1){
                sum = nums[left] + nums[--mid] + nums[right];
            }
            
            if (sum < 0) left++;
            else if (sum > 0) right--;
            else {
                List<Integer> sub = new ArrayList<>();
                sub.add(nums[left]);
                sub.add(nums[mid]);
                sub.add(nums[right]);
                list.add(sub);
                
                if (mid - left < right - mid) right--;
                else left++;
            }
            
            
        }
        
        return list;
    }
}
