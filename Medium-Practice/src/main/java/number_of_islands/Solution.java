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
               
        for (int row = 0; row < rows; row++){
            ArrayList<int[]> currentIslands = new ArrayList<int[]>();
            for (int col = 0; col < columns; col++){
                // Determine land ranges within row
                if (grid[row][col] == '1') {
                    int[] island = new int[2];
                    // Set Width Range Min Boundary
                    island[0] = col;
                    // Determine width of current island within current row
                    while (col+1 < columns && grid[row][col+1] == '1') {
                        col++;
                    }
                    // Set Width Range Max Boundary
                    island[1] = col;
                    
                    currentIslands.add(island);
                }
                
            }
        }
        
        return islandCount;
    }

    private boolean islandsConnect(int firstMin, int firstMax, int secondMin, int secondMax) {
        if (firstMin < secondMin){
            return secondMin <= firstMax;
        }
        return firstMin <= secondMax;
    }
}
