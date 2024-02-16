/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_size_subarray_sum;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums){
        
        /*
            1. While END < NUMS length
                a. If first number is >= target, return 1
                b. Increment END
                c. SUM equals NUMS[START] + NUMS[END]
                d. While SUM >= TARGET
                    i. If MINLENGTH < (END - START)
                        1. MINLENGTH equals END-START
                    ii. Increment START
                    iii. Update SUM
                e. Return MINLENGTH + 1 or 0
        */
        
        int minLength = Integer.MAX_VALUE, start = 0, end = 0, currentSum = 0;
        

        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
