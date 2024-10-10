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
        // Initialize dp array to store calculated results
        int dp[][] = new int[grid.length][grid[0].length];
        return dp(0, 0, grid, dp); // Start recursion from top-left cell
    }
    
    private int dp(int i , int j, int[][] grid, int[][] dp){
        
        // Base case: reached the bottom right cell, return its value
        if (i == grid.length-1 && j == grid[0].length-1) return grid[i][j];
        
        // Out-of-bounds check: return a large value to avoid this path
        if (i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;
        
        // If the result for this cell is already calculated, return it
        if (dp[i][j] != 0) return dp[i][j];
        
        int down = dp(i+1, j, grid, dp); // Recursively explore the path going down
        int right = dp(i, j+1, grid, dp); // Recursviely explore the path going right
        
        // Calculate the min path sum for current cell and store it in dp
        return dp[i][j] = grid[i][j] + Math.min(down, right);
    }
}
