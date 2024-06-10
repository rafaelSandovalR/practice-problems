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
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }

        return ans;
    }
}
