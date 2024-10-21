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
public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        int n = nums.length;
        for(int i = 0; i < n-2 && nums[i] <= 0; i++){
            if (i != 0 && nums[i-1] == nums[i]) continue;
            twoSum(-nums[i], i+1, nums, res);
        }
        
        return res;
    }
    
    private void twoSum(int target, int left, int[] nums, List<List<Integer>> result){
        int right = nums.length - 1;
        
        while (left < right){
            if (nums[left] + nums[right] > target){
                right--;
                continue;
            }
            
            if (nums[left] + nums[right] < target){
                left++;
                continue;
            }
            
            result.add(Arrays.asList(-target, nums[left], nums[right]));
            left++;
            right--;
            
            while (left < right && nums[left] == nums[left - 1]){
                left++;
            }
        }
    }
}
