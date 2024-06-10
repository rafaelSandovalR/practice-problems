/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single_number;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int singleNumber(int[] nums){
        int ans = -1;
        Arrays.sort(nums);
        
        for (int i = 0, j = 1; j < nums.length; i+=2, j+=2){
            if (j >= nums.length) ans = nums[i];
            else if (nums[i] != nums[j]){
                ans = nums[i];
                break;
            }
        }
        
        return ans;
    }
}
