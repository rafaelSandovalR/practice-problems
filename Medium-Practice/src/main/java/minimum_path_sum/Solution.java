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
            Arrays.fill(dp[i], -1);
        }

        findMinPath(grid, dp, 0, 0, 0);
        
        return dp[m-1][n-1];
    }
    
    private void findMinPath(int[][] grid, int[][] dp, int row, int col, int prev){
        
        int sum = grid[row][col] + prev;
        int dpVal = dp[row][col];
        int minSum = dpVal == -1 ? sum : Math.min(sum, dpVal);
        dp[row][col] = minSum;
        
        if (dpVal != -1 && dpVal < sum) return;
        
        if (row + 1 < grid.length) findMinPath(grid, dp, row + 1, col, minSum);
        if (col + 1 < grid[0].length) findMinPath(grid, dp, row, col + 1, minSum);
        
    }
}
