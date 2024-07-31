/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_consecutive_sequence;

import java.util.HashMap;

/**
 *
 * @author Rsand
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        var map = new HashMap<Integer, Boolean>();
        int max = 0;
        
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], false);
        }
        
        for(int i = 0; i < nums.length; i++){
            
            int num = nums[i];
            int count = 1;
            
            if (!map.get(num)){ // If number hasn't been scanned already
                
                map.put(num, true);
                
                // Ascending check
                count += scan(map, 1, num);

                // Descending check
                count += scan(map, -1, num);

                max = Math.max(max, count);
            }
        }
        
        return  max;
    }
    
    private int scan(HashMap<Integer, Boolean> map, int direction, int num){
        
        int count = 0;
        map.put(num, true);
        
        while (map.containsKey(num + direction)){
            count++;
            num = num + direction;
            map.put(num, true);
        }
        
        return count;
    }
}
