/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package majority_element;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        
        int count = 1;
        int ptr = 0;
        int majoritySize = (nums.length / 2) + 1;
        
        while (count < majoritySize){
            if (nums[ptr] == nums[ptr + 1]) count++;
            else count = 1;
            
            ptr++;
        }
        
        return nums[ptr];
    }
}
