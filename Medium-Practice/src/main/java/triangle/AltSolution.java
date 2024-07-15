/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class AltSolution {
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] memo = new int[n][n];
        
        for(int[] row : memo){
            Arrays.fill(row, -1); // Initialize memo with -1 (not calculated yet)
        }
        
        return findMinimumPathSum(0, 0, triangle, memo);
    }
    
    private int findMinimumPathSum(int row, int col, List<List<Integer>> triangle, int[][] memo){
        if (row == triangle.size()) return 0; // Base case: reached the bottom
        
        if (memo[row][col] != -1) return memo[row][col]; // Check memo: if result already calculated return it
        
        // Recursive case: calculate minimum path from current position
        int pathSumLeft = findMinimumPathSum(row + 1, col, triangle, memo);
        int pathSumRight = findMinimumPathSum(row + 1, col + 1, triangle, memo);
        
        // Store and return the minimum path sum for this position
        return memo[row][col] = triangle.get(row).get(col) + Math.min(pathSumLeft, pathSumRight);
    }
}
