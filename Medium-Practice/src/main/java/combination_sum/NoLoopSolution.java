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
public class NoLoopSolution {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        // Arrays.sort(candidates);         No need to sort for this algorithm
        List<List<Integer>> answer = new ArrayList<>();
        generate(candidates, target, 0, answer, new ArrayList<>());
        return answer;
    }

    private void generate(int[] nums, int target, int i, List<List<Integer>> answer, ArrayList<Integer> currentCombo) {
        if (i == nums.length){
            if (0 == target) answer.add(new ArrayList<>(currentCombo));
            return;
        }
        
        if (nums[i] <= target){
            currentCombo.add(nums[i]);
            generate(nums, target - nums[i], i, answer, currentCombo); // Explore with current digit
            currentCombo.remove(currentCombo.size() - 1);
        }
        
        generate(nums, target, i + 1, answer, currentCombo);    // Explore without current digit
    }
}
