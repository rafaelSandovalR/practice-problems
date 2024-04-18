/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number_of_islands;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int numIslands(char[][] grid){
        int rows = grid.length;
        int columns = grid[0].length;
        int islandCount = 0;
               
        // Loop through each cell in the grid
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < columns; col++){
             
                // If encounters a new island
                if (grid[row][col] == '1'){
                    bfs(grid, row, col); // Perform BFS to explore the island
                    islandCount++; // Increment island count for new island
                }
            }
        }
        
        return islandCount;
    }
    
    private void bfs(char[][] grid, int row, int col){
        int[] directions = {0,1,0,-1}; // Directions for up, right, down, left;
        
        // Create a queue to store cells to be explored
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col}); // Add starting cell
        
        
        grid[row][col] = '2'; // Mark the starting cell as visited
        
        while (!queue.isEmpty()){
            int[] currentCell = queue.poll(); // Get the next cell to explore
            int currentRow = currentCell[0];
            int currentCol = currentCell[1];
            
            // Explore all four neighbors of the current cell
            for (int i = 0; i < directions.length - 1; i++){
                int newRow = currentRow + directions[i];
                int newCol = currentCol + directions[i + 1]; // +1 to skip current dir
                
                // Check if neighbor is within grid bounds, unvisited land and not already processed
                if (isValid(grid, newRow,newCol)){
                    if (grid[newRow][newCol] == '1') {
                        grid[newRow][newCol] = '2';
                        queue.add(new int[]{newRow, newCol});
                    }
                }

            }
        }
    }

    private boolean isValid(char[][] grid, int newRow, int newCol) {
        return (newRow >= 0 && newRow < grid.length) && (newCol >= 0 && newCol < grid[0].length);
    }
   
}
