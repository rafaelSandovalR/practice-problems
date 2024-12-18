/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coin_change;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int coinChange(int[] coins, int amount){
        
        Arrays.sort(coins);
        
        // Find the largest coin we can use
        int max = -1; // Index of largest coin
        for (int i = 0; i < coins.length; i++){
            if (amount - coins[i] >= 0) max = i;
        }
        
        if (max < 0) return -1; // No coin less than the amount
        
        int[] qty = new int[coins.length];
        int rmdr = amount;
        
        
        for (int i = max; i >= 0; i--){
            
            
        }
    }
}
