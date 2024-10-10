/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package best_time_for_stock;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxProfit(int[] prices){
        
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > min) max = Math.max(max, prices[i]-min);
            else min = prices[i];
        }
        
        return max;
    }
}
