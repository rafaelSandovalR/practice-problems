/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number_of_islands;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        char[][] grid = {   {'0','0','1','0','1','0'},
                            {'0','1','1','1','0','0'},
                            {'1','0','0','1','0','1'},
                            {'1','0','0','0','0','0'},
                            {'1','0','0','1','1','1'}   };
        
        int islands = sol.numIslands(grid);
    }
}
