/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package richest_customer_wealth;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maximumWealth(int[][] accounts){
        int maxWealth = 0, customerWealth = 0;
        
        for(int i = 0; i < accounts.length; i++){
            
            for(int j = 0; j < accounts[0].length; j++){
                customerWealth += accounts[i][j];
            }
            
            if(customerWealth > maxWealth){ maxWealth = customerWealth;}
            customerWealth = 0;
        }
        
        return maxWealth;
    }
}
