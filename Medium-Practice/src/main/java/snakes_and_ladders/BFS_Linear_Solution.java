/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

/**
 *
 * @author Rsand
 */
public class BFS_Linear_Solution {
    public int snakesAndLadders(int[][] board){
        final int n = board.length;
        final int endSquare = n * n;
        
        /**
         * Convert the Boustrophedon orderd 2-D board to a simple
         * linear 1-D array indexed by square number. Nothing in 
         * the game requires a 2-D board.
         */
        
        short[] brd = new short[endSquare + 1];
        int brdIdx = 1;
        
        for (int row = n-1; row >= 0; row--){
            for (int col = 0; col < n ; col++){
                brd[brdIdx++] = (short)board[row][col];
                if (--row < 0) break;
                
            }
            for (int col = n - 1; col >= 0; col--) {
                brd[brdIdx++] = (short) board[row][col];
            }
        }
    }
}
