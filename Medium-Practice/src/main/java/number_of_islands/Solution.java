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
            int islandsInRow = 0;
            for (int col = 0; col < columns; col++){
                // Determine land ranges within row
                if (grid[row][col] == '1') {
                    boolean connected = false;
                    int[] island = new int[3];
                    // Set last row updated
                    island[0] = row;
                    // Set Width Range Min Boundary
                    island[1] = col;
                    // Determine width of current island within current row
                    while (col+1 < columns && grid[row][col+1] == '1') {
                        col++;
                    }
                    // Set Width Range Max Boundary
                    island[2] = col;
                    
                    // Add island if none exist or if last island isn't from previous row
                    if (islands.isEmpty() || (islands.size()-1-islandsInRow > 0 && islands.get(islands.size()-1-islandsInRow)[0] != row - 1)){
                        islands.add(island);
                        islandsInRow++;
                    }
                    // Determine if land connects to prexisting land
                    else {
                        // Go through list in reverse for all islands found in the previous row
                        for (int i = islands.size() - islandsInRow - 1; i >= 0 && islands.get(i)[0] == row - 1; i--) {
                            int[] islandInList = islands.get(i);
                            if (islandsConnect(island[1], island[2], islandInList[1], islandInList[2])) {
                                // Move updated island edge to the end of the list
                                islands.remove(i);
                                islands.add(island);
                                connected = true;
                                islandsInRow++;
                            } 
                        } 
                        if (!connected){
                            islands.add(island);
                            islandsInRow++;
                        }
                    }                    
                }  
            }
        }
        
        return islands.size();
    }

    private boolean islandsConnect(int firstMin, int firstMax, int secondMin, int secondMax) {
        if (firstMin < secondMin){
            return secondMin <= firstMax;
        }
        return firstMin <= secondMax;
    }
}
