/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class DPSolution {
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] dp = new int[n][n];
        
        // Fill last row
        for (int i = 0; i < n; i++){
            dp[n - 1][i] = triangle.get(n - 1).get(i);
        }
        
        for (int i = n - 2; i >= 0; i--){
            for (int j = i; j >= 0; j--){
                int num = triangle.get(i).get(j);
                int adj1 = dp[i + 1][j + 1];
                int adj2 = dp[i + 1][j];
                
                dp[i][j] = Math.min(num + adj1, num + adj2);
            }
        }
        
        return dp[0][0];
    }
}
