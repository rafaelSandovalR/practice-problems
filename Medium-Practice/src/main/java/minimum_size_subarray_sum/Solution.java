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
            1. Use two pointers: start and end
                a. start is the point where to start calculation
                b. end is the end of the range for the calculation
            2. Create vars: 
                a. to hold minimum sub array length
                b. to hold current sub array length
                c. current sum in each inner loop
            3. While START is less than nums length
                a. Check if START is equal to or greater than target
                    i. if so: set MIN to 1
                b. Increment END
                c. If END is equal to nums length
                    i. Break
                b. Else
                    i. Start loop to get subarray while END is less than nums length 
                        OR current sum is less than target
                        1. Set CURRENT SUM to CURRENT SUM + [END]
                        2. If CURRENT SUM is greater than or equal to target
                            a. Set CURRENT SUM equal to 0
                            b. set MIN length to MIN(MIN, END minus start)
                        3. Else
                            a. Increment END
                    ii. Set START to equal END 
            4. Return MIN
        */
        int minLength = Integer.MAX_VALUE, start = 0, end = 0, currentSum = 0;
        
        while (start < nums.length){
            if (nums[start] >= target){
                minLength = 1;
                break;
            }
            
            end++;
            if (end == nums.length) break;
            
            currentSum += nums[start];
            
            while (end < nums.length && currentSum < target){
                currentSum += nums[end];
                
                if (currentSum >= target){
                    
                    //subtract first element to test if smaller length possible
                    currentSum -= nums[start];
                    
                    while(currentSum >=target){
                        minLength = end-start;
                        start++;
                        currentSum -= nums[start];
                    }
                    
                    if (currentSum >= target){
                        minLength = end - start;
                    } else if (end - start < minLength){
                        minLength = (end - start) + 1;
                    }
                    
                    currentSum = 0;
                    break;
                    
                } else{
                    end++;
                }
            }
            start = end;
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
