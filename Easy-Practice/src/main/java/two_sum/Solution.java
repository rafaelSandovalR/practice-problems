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
}
