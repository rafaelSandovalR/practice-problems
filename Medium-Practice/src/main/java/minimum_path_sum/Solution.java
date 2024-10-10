/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_path_sum;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int num = grid[i][j];
                int leftSum = j == 0 ? -1 : num + grid[i][j-1];
                int upSum = i == 0 ? -1 : num + grid[i-1][j];
                
                int minSum = leftSum == -1 && upSum == -1 ? num 
                        : leftSum == -1 ? upSum
                        : upSum == -1 ? leftSum
                        : Math.min(leftSum, upSum);
                
                dp[i][j] = minSum;
            }
        }
        
        return dp[m-1][n-1];
    }
}
