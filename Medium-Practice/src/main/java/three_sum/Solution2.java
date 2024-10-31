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
        Arrays.sort(nums); // Sort the array to efficiently find triplets
        
        int n = nums.length;
        // Iterate through the array until the third-to-last element
        // and while nums[i] is <= 0 because otherwise it would be impossible
        // to find two other numbers to make zero
        for(int i = 0; i < n-2 && nums[i] <= 0; i++){
            // Skip duplicate numbers to avoid duplicate triplets
            if (i != 0 && nums[i-1] == nums[i]) continue;
            
            // Find two numbers that add up to -nums[i]
            twoSum(-nums[i], i+1, nums, res);
        }
        
        return res;
    }
    
    /**
     * Finds two numbers in an array that add up to a given target.
     *
     * @param target The target sum.
     * @param left The starting index for the left pointer.
     * @param nums The input array of integers.
     * @param result The list to store the resulting triplets.
     */
    private void twoSum(int target, int left, int[] nums, List<List<Integer>> result){
        int right = nums.length - 1; // Initialize the right pointer to the end of the array
        
        while (left < right){
            if (nums[left] + nums[right] > target){ // If the sum is greater than the target
                right--; // Move the right pointer to the left
                continue;
            }
            
            if (nums[left] + nums[right] < target){ // If the sum is less than the target
                left++; // Move the left pointer to the right
                continue;
            }
            
            // If the sum is equal to the target
            result.add(Arrays.asList(-target, nums[left], nums[right])); // Add triplets to result list
            // Move both pointers
            left++;
            right--;
            
            // Skip duplicate numbers to avoid duplicate triplets
            while (left < right && nums[left] == nums[left - 1]){
                left++;
            }
        }
    }
}
