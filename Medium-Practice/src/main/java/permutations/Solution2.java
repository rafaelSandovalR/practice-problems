/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permutations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();    // Main List of permutations
        permute(res, nums, 0); // Call recursive helper function

        return res;
    }
    
    private void permute(List<List<Integer>> res, int[] nums, int start) {
        // Base case: If start reaches the end, a permutation is complete
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            // Convert current array arrangement into list
            for (int num : nums) {
                permutation.add(num);
            }
            res.add(permutation); // Add permutation to result list
            return;
        }

        // If end hasn't been reached
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);       // Swap elements at start and i
            permute(res, nums, start + 1);  // Recursively generate permutation for the remaining elements
            swap(nums, start, i);       // Backtrack: Swap back to restore the original order
        }
    }
    

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
