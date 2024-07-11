/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climbing_stairs;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int climbStairs(int n){
        // Create variables holding the values for 0 steps and 1 step
        int ans = 0, pre1 = 0, pre2 = 1;
        
        
        for (int i = 0; i < n ; i++){
            // Answer to current step equals the last two steps combined
            ans = pre1 + pre2;
            
            // Update the last two steps for next step
            pre1 = pre2;
            pre2 = ans;
        }
        
        return ans;
    }
}
