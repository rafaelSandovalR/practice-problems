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
public class Solution {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();    // Main List of permutations
        List<Integer> sub = new ArrayList<>();          // List representing permutation
        boolean[] used = new boolean[nums.length];      // Array to indicate digits already used in current permutation
        
        // Using each digit as a starting point, find possible combinations
        for (int i = 0; i < nums.length; i++){
            permute(res, sub, nums, i, used);
        }

        return res;
    }
    
    /**
     * 
     * @param res   Main List to build, comprised all possible permutations
     * @param sub   Sub list to build, representing individual permutation
     * @param nums  Array of digits to use
     * @param idx   Pointer for both arrays: nums and used
     * @param used  Array to mark digit as used, to avoid reuse
     */
    private void permute(List<List<Integer>> res, List<Integer> sub, int[] nums, int idx, boolean[] used){

        sub.add(nums[idx]); // Add digit at current index to sublist
        used[idx] = true;   // Mark digit as used
        int currIdx = idx;  // Save current index
        
        // Loop based on how many more digits needed based on current permutation
        for (int i = 0; i < nums.length - sub.size(); i++){
            // Move idx to the next unused digit
            while (used[idx]){
                idx++;
                idx = idx % nums.length; // Use circular array logic
            }
            permute(res, sub, nums, idx++, used); // Recursively build the permutation
            idx = idx % nums.length; // Ensure idx is valid
        }
        
        // When current permutation consists of all digits, add copy of sublist to main list
        if (sub.size() == nums.length) {
            res.add(new ArrayList<>(sub));
        }
        
        // Backtracking: Remove the latest digit added to permutation and mark as unused
        sub.remove(sub.size() - 1);
        used[currIdx] = false;
    }

}
