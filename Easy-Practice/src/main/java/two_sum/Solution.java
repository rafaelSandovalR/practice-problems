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
        
        int[] answer = new int[2];
        
        var map = new HashMap<Integer, ArrayList<Integer>>();
        
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], new ArrayList<Integer>()));
            map.get(nums[i]).add(i);
        }
        
        for (Integer num : map.keySet()){
            int diff = target - num;
            
            if (diff == num && map.get(num).size() == 2){
                answer[0] = map.get(num).get(0);
                answer[1] = map.get(num).get(1);

            } else if (map.containsKey(diff)){
                answer[0] = map.get(num).get(0);
                answer[1] = map.get(diff).get(0);
            }
        }

        
        return answer;
    }
}
