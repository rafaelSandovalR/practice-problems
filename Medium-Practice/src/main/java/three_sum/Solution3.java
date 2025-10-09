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
public class Solution3 {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        for (int left = 0; left < n - 2; left++){
            // Skip duplicates of the first number
            if (left > 0 && nums[left] == nums[left - 1]) continue;
            
            // Start two-sum check with remaining numbers
            int mid = left+1, right = n-1;
            while (mid < right){
                int sum = nums[left] + nums[mid] + nums[right];
                if (sum < 0) { mid++; continue; }
                if (sum > 0) { right--; continue; } // <- Implicitly skips third number
                // If sum equals 0, add to main list
                ans.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                
                mid++; right--;
                // Skip duplicates of second number
                while (mid < right && nums[mid] == nums[mid-1]) mid++;
                
                /*  Because it skips the second number duplicate until the "mid"
                    number is greater than before, the sum will become > 0 in 
                    the next pass, triggering the "right" to decrement. Thereby
                    implicitly skipping third number duplicates.
                */
            }
        }
        
        return ans;
    }
}
