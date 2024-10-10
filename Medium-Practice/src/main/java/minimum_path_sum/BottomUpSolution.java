/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_path_sum;

/**
 *
 * @author Rsand
 */
public class BottomUpSolution {
    public int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n]; // 1D array to store minimum path sums for current row
        
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int curr = grid[i][j];
                dp[j] = i==0 && j==0 ? curr // Base case: starting cell, initialize with its value
                        : i==0 ? dp[j - 1] + curr // First row: can only reach from the left
                        : j==0 ? dp[j] + curr // First column: can only reach from above
                        : Math.min(dp[j-1], dp[j]) + curr; // Other cells: take the min path from left or above
            }
        }
        
        return dp[n-1];
    }
}
