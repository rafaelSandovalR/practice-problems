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
        if (amount < coins[0]) return -1;
        
        int biggestCoin = coins.length - 1;
        int[] minQty = prepArray(coins, amount);
        
        for (int i = coins[biggestCoin] + 1; i <= amount; i++){
            minQty[i] = getMin(i, coins[0], minQty);
        }
        
        return minQty[amount];
    }
    
    private int[] prepArray(int[] coins, int amount){
        
        int[] minQty = new int[amount + 1];
        Arrays.fill(minQty, -1);
        
        for (int coin : coins){
            minQty[coin] = 1;
        }
        return minQty;
    }
    
    private int getMin(int i, int smallestCoin, int[] minQty){
        
        int min = Integer.MAX_VALUE;
        
        for (int augend = smallestCoin; augend <= i / 2; augend++){
            int addend = i - augend;
            
            if (minQty[augend] < 0 || minQty[addend] < 0) continue;
            
            int qty = minQty[augend] + minQty[addend];
            min = Math.min(min, qty);
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
