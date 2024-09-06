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
        
        Node current = new Node();
        
        if (isUniform(grid)){
            
        }
    }
    
    private boolean isUniform(int[][] grid){
        int value = grid[0][0];
        int n = grid.length;
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] != value) return false;
            }
        }
        
        return true;
    }
}
