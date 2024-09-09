/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_quad_tree;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        int[][] grid = {{1,1,0,0},{1,1,0,0},{1,1,1,1},{1,1,1,1}};
        
        int[][] grid2 ={{1, 1, 1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 0}};
        
        int[][] grid3 = {{1,1,0,0},{0,0,1,1},{1,1,0,0},{0,0,1,1}};
        Solution sol = new Solution();
        Node QuadTree = sol.construct(grid3);
    }
}
