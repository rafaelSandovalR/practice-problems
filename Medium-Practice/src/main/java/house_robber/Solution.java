/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package house_robber;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int rob(int[] nums){
/* ORIGINAL SOLUTION
        
        int n = nums.length;
        
        switch (n) {
            case 1:
                return nums[0];
            case 2:
                return Math.max(nums[0], nums[1]);
        }
        
        int prev1 = 0, prev2 = nums[0], prev3 = nums[1], max = 0;
        
        for (int i = 2, j = 1; i < n; i++, j++){
            max = Math.max(prev1, prev2) + nums[i];
            prev1 = prev2;
            prev2 = prev3;
            prev3 = max;
        }
        
        return Math.max(max, prev2); 
*/

// Slightly more concise solution

        // Base Case: Only one house, rob it!
        if (nums.length == 1) return nums[0];
        
        // Track potential max earnings for previous two houses
        int prev1 = nums[0]; // Max money if robbing house 0
        int prev2 = Math.max(nums[0], nums[1]); // Max money if robbing either house 0 or 1
        int max = prev2; // Initialize the overall max to the best of the first two houses
        
        // Iterate through the remaining houses
        for (int i = 2; i < nums.length; i++){
            
            // For the current house, consider two options:
            // 1. Don't rob it (curr = prev2, the best option from the previous two houses)
            // 2. Rob it (curr = prev1 + nums[i], best option before last house + current value)
            int curr = Math.max(prev2, prev1 + nums[i]);
            
            // Update the overall maximum if the current choice is better
            max = Math.max(curr, max);
            
            // Silde the window
            prev1 = prev2;
            prev2 = curr;
        }
        
        return max;
    }
}
