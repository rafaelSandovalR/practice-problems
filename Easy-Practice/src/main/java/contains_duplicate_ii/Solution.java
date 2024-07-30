/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contains_duplicate_ii;

import java.util.HashMap;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        var map = new HashMap<Integer, Integer>(); // Key: Number   Value: Last Index Seen
        
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            if (map.containsKey(num)){
                int diff = i - map.get(num);
                
                if (diff <= k) return true;
            }
            
            map.put(num, i);
        }
        
        return false;
    }
}
