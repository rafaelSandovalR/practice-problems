/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_consecutive_sequence;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int longestConsecutive(int[] nums){
        int n = nums.length;
        if (n == 0) return 0;
        
        Arrays.sort(nums);
        
        int maxLen = 0;
        int currLen = 1;
        
        for (int i = 1; i < n; i++){
            if (nums[i] == nums[i - 1] + 1){ // If current element is one more than previous
                currLen++; 
            } else if (nums[i] == nums[i - 1]){ // If current element is the same as previous, skip it
                continue;
            } else { // If the current element breaks the consecutive sequence
                maxLen = Math.max(maxLen, currLen);
                currLen = 1; // Reset to start tracking a new sequence
            }
        }
        
        return Math.max(maxLen, currLen);
    }
}
