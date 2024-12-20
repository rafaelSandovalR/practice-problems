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
        int n = coins.length;
        int[] minQty = prepArray(coins, amount);
        
        for (int i = coins[n] + 1; i <= amount; i++){
            minQty[i] = getMin(coins, amount);
        }
        
        return minQty[amount];
    }
    
    private int[] prepArray(int[] coins, int amount){
        Arrays.sort(coins);
        
        int[] minQty = new int[amount + 1];
        Arrays.fill(minQty, -1);
        
        for (int coin : coins){
            minQty[coin] = 1;
        }
        return minQty;
    }
    
    private int getMin(int[] coins, int amount){
        
    }
}
