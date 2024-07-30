/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Rsand
 */
public class Solution {
    
    // HashMap Approach
    public int[] twoSum(int[] nums, int target){
        
        var map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
    
    
    // Brute Force Approach
    public int[]twoSumAlt(int[] nums, int target){
        
        // Iterates through potential distances between elements
        for (int i = 1; i < nums.length; i++){
            
            // Checks pairs with the current distance 'i'
            for (int j = i; j < nums.length; j++){
                
                if (nums[j] + nums[j-i] == target){
                    return new int[] {j, j-i};
                }
            }
        }
        
        return null;
    }
}
