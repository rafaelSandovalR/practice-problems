/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surrounded_regions;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        char[][] board = {
            {'X', 'X', 'X', 'X', 'O', 'X'},
            {'O', 'X', 'X', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'O', 'O', 'O'},
            {'X', 'O', 'O', 'O', 'X', 'O'},
            {'O', 'O', 'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'O', 'X', 'X'}};
        
        sol.solve(board);
        
    }
}
