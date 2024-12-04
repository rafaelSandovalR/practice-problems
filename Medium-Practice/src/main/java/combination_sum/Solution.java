/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        
        Arrays.sort(candidates); 
        List<List<Integer>> answer = new ArrayList<>(); // Main List of Combinations
        List<Integer> combo = new ArrayList<>();        // Individual Combination Sums

        
        generate(candidates, target, 0, answer, combo); // Recursively generate combinations
        
        return answer;
    }
    
    public void generate(int[] candidates, int target, int ptr, List<List<Integer>> answer, List<Integer> combo){
        
        // Loop through candidates (from starting ptr) to determine possible combinations
        // with each candidate at this specific place in the combination
        while (ptr < candidates.length){
            int digit = candidates[ptr];    // Digit in focus
            target -= digit;                // Keep subtracting from target to find matching sums

            if (target < 0) return; // If target is negative, combination sum is bigger than original target

            combo.add(digit);   // Otherwise, we can add the digit to the combination

            // If there is still room, recursively look for more candidates, starting with the current (ptr)
            if (target > 0) generate(candidates, target, ptr, answer, combo);
            
            // If target has reached zero, add a copy of the combination to the main list
            if (target == 0) answer.add(List.copyOf(combo));

            // Backtracking: Remove this digit from the combination, located at last index
            combo.remove(combo.size() - 1);
            ptr++;  // Move to the next digit
        }
    }
    
    // Slightly more concise version
    
    public void generateCombinations(int[] candidates, int target, int currentIndex, List<List<Integer>> answer, List<Integer> currentCombo){
        
        if (target == 0) {
            answer.add(List.copyOf(currentCombo));
            return; // No need for further recursion
        }
        
        for (int i = 0; currentIndex < candidates.length; i++){
            int candidate = candidates[i];
            if (target - candidate < 0) break; // Pruning
            
            currentCombo.add(candidate);
            generateCombinations(candidates, target - candidate, i, answer, currentCombo);
            currentCombo.remove(currentCombo.size() - 1);
        }
    }
}
