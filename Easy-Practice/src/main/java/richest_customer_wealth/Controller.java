/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package richest_customer_wealth;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
        
        System.out.println(s.maximumWealth(accounts));
    }
}
