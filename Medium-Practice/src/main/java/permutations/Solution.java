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
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        
        for (int i = 0; i < nums.length; i++){
            permute(res, sub, nums, i, used);
        }

        return res;
    }
    
    private void permute(List<List<Integer>> res, List<Integer> sub, int[] nums, int idx, boolean[] used){
        
        int digit = nums[idx];
        sub.add(digit);
        used[idx] = true;
        int currIdx = idx;
        
        for (int i = 0; i < nums.length - sub.size(); i++){
            while (used[idx]){
                idx++;
                idx = idx % nums.length;
            }
            permute(res, sub, nums, idx++, used);
            idx = idx % nums.length;
        }
        
        if (sub.size() == nums.length) {
            res.add(new ArrayList<>(sub));
        }
        
        sub.remove(sub.size() - 1);
        used[currIdx] = false;
    }
}
