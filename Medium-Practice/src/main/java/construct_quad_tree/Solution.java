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
        
        return construct(grid, new int[]{0,grid.length-1}, new int[]{0, grid.length-1});
    }
    
    private Node construct(int[][] grid, int[] rowRange, int[] colRange){
        
        int n = rowRange[1] - rowRange[0] + 1;
        
        Node current = new Node();

        if (isUniform(grid, rowRange, colRange)) {
            current.isLeaf = true;
            current.val = grid[0][0] == 1;
        } else {
            int rowStart = rowRange[0];
            int colStart = colRange[0];
            int rowEnd = rowRange[1];
            int colEnd = colRange[1];
            
            int[] rowFirstHalf = {rowStart, rowStart + (n/2) - 1};
            int[] rowSecondHalf = {rowStart + (n/2), rowEnd};
            int[] colFirstHalf = {colStart, colStart + (n/2) - 1};
            int[] colSecondHalf = {colStart + (n/2), colEnd};
        
            
            current.topLeft = construct(grid, rowFirstHalf, colFirstHalf);
            current.topRight = construct(grid, rowFirstHalf, colSecondHalf);
            current.bottomLeft = construct(grid, rowSecondHalf, colFirstHalf);
            current.bottomRight = construct(grid, rowSecondHalf, colSecondHalf);
        }
        
        return current;
    }
    
    private boolean isUniform(int[][] grid, int[] rowRange, int[] colRange){
        int rowStart = rowRange[0];
        int colStart = colRange[0];
        
        int value = grid[rowStart][colStart];
        int n = rowRange[1] - rowRange[0] + 1;
        
        for (int i = rowStart; i < n; i++){
            for (int j = colStart; j < n; j++){
                if (grid[i][j] != value) return false;
            }
        }
        
        return true;
    }
}
