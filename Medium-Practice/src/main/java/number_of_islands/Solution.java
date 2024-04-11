/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number_of_islands;

import java.util.ArrayList;

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
        
    }
}
