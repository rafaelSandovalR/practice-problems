/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_path_sum;

/**
 *
 * @author Rsand
 */
public class recursiveSolution {
    public int minPathSum(int[][] grid){
        int dp[][] = new int[grid.length][grid[0].length];
        return dp(0, 0, grid, dp);
    }
    
    private int dp(int i , int j, int[][] grid, int[][] dp){
        
        if (i == grid.length-1 && j == grid[0].length-1) return grid[i][j];
        
        if (i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;
        
        if (dp[i][j] != 0) return dp[i][j];
        
        int down = dp(i+1, j, grid, dp);
        int right = dp(i, j+1, grid, dp);
        
        return dp[i][j] = grid[i][j] + Math.min(down, right);
    }
}
