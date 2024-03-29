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
        
        ArrayList<int[]> islands = new ArrayList<int[]>();
        
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < columns; col++){
                // Determine land ranges within row
                if (grid[row][col] == '1') {
                    int[] island = new int[3]; // Index 0 = last row updated, Index 1 = range min, Index 2 = range max
                    island[0] = row;
                    island[1] = col;
                    while (grid[row][col] == '1') {
                        col++;
                    }
                    island[2] = col;
                }
                // Determine if land connects to prexisting land
                // If so, update island range and last row updated
                // If not, add new island to list
            }
        }
        
        return islands.size();
    }
}
