/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_quad_tree;

/**
 *
 * @author Rsand
 */
public class Solution {
    public Node construct(int[][] grid) {
        
        // Start the recursive construction from the entire grid
        return construct(grid, new int[]{0,grid.length-1}, new int[]{0, grid.length-1});
    }
    
    
    private Node construct(int[][] grid, int[] rowRange, int[] colRange){

        // Create new quadtree node
        Node current = new Node();
        
        // Set quadtree node's val as top-left corner value of the subgrid
        int rowStart = rowRange[0];
        int colStart = colRange[0];
        current.val = grid[rowStart][colStart] == 1; // Convert value to boolean

        // Check if the subgrid is uniform (all values are the same)
        if (isUniform(grid, rowRange, colRange)) {
            current.isLeaf = true; // If uniform, make the node as a leaf
        } else {
            // If not uniform, divide the subgrid into four quadrants and recursively construct child nodes
            
            // Variables to keep following array assigments readable
            int rowEnd = rowRange[1];
            int colEnd = colRange[1];
            int half = (rowRange[1] - rowRange[0]) / 2;
            
            // Calculate ranges for each quadrant
            int[] rowFirstHalf = {rowStart, rowStart + half}; // From first index to half way mark
            int[] rowSecondHalf = {rowStart + half + 1, rowEnd}; // From right after half way mark to last index
            int[] colFirstHalf = {colStart, colStart + half};
            int[] colSecondHalf = {colStart + half + 1, colEnd};
        
            // Recursively constuct child nodes for each quadrant
            current.topLeft = construct(grid, rowFirstHalf, colFirstHalf);
            current.topRight = construct(grid, rowFirstHalf, colSecondHalf);
            current.bottomLeft = construct(grid, rowSecondHalf, colFirstHalf);
            current.bottomRight = construct(grid, rowSecondHalf, colSecondHalf);
        }
        
        //Return constructed node
        return current;
    }
    
    private boolean isUniform(int[][] grid, int[] rowRange, int[] colRange){
        
        // Early termination if single square
        if (rowRange[0] == rowRange[1]) return true;
        
        int rowStart = rowRange[0];
        int colStart = colRange[0];
        
        // Get the value at the top-left corner of subgrid
        int value = grid[rowStart][colStart];
        
        // Get length of subgrid to determine where to stop scanning
        int n = rowRange[1] - rowRange[0] + 1;
        
        // Iterate through the subgrid and check if all values are the same
        for (int i = rowStart; i < rowStart + n; i++){
            for (int j = colStart; j < colStart + n; j++){
                if (grid[i][j] != value) return false;
            }
        }
        
        return true;
    }
}
