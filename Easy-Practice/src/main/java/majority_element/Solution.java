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
/**
 * ORIGINAL SOLUTION
 * TIME COMPLEXITY: O(n log n)
         * Arrays.sort(nums);
         *
         * int count = 1; int ptr = 0; int majoritySize = (nums.length / 2) + 1;
         *
         * while (count < majoritySize){ if (nums[ptr] == nums[ptr + 1])
         * count++; else count = 1;
         *
         * ptr++; }
         *
         * return nums[ptr];
 */

/**
 * CONCISE SOLUTION: 
 * TIME COMPLEXITY: O(n log n)
         * Arrays.sort(nums); return nums[nums.length / 2];
 */

/**
 * BOYER-MOORE VOTING ALGORITHM
 * TIME COMPLEXITY: O(n)
 */
        int count = 0;
        int candidate = 0;
        
        for (int num : nums){
            if (count == 0) candidate = num;
            
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
        
        /** OPTIONAL VERIFICATION STEP
         * count = 0;
         * for (int num : nums) {
         *  if (num == candidate){
         *      count++;
         *  }
         * if (count > nums.length / 2) return candidate;
         * else return -1;
         * }
         */
    }
}
