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
         * Convert the Boustrophedon ordered 2-D board to a simple
         * linear 1-D array indexed by square number. Nothing in 
         * the game requires a 2-D board.
         */
        
        short[] brd = new short[endSquare + 1];
        int brdIdx = 1; // Tracks position in the linear array where to store next value
        
        // Convert to linear array, start with last row
        for (int row = n - 1; row >= 0; row--) {
            // Go through board columns from left to right
            for (int col = 0; col < n; col++) {
                brd[brdIdx++] = (short) board[row][col]; // Cast int board value to short
            }
            
            if (--row < 0) break; // Move to next row and break if previous was last row

            // Go through even rows in reverse
            for (int col = n - 1; col >= 0; col--) {
                brd[brdIdx++] = (short) board[row][col];
            }
        }
        
        /**
         * Circular queue for the BFS. If the queue is empty
         * (bfsQueueRead == bfsQueueWrite), then there are no more possible
         * moves in the game. Each entry in the queue is the square number of
         * the square to make moves from.
         */
        
        final int bfsQueueLen = Math.min(n * n, 8 * n);
        short[] bfsQueue = new short[bfsQueueLen]; // Queue for Squares to be explored
        int bfsQueueRead = 0; // Keeps track of the index from which the next element will be read from the queue
        int bfsQueueWrite = 0; // Keeps track of the index at which the next element will be added to the queue
        
        bfsQueue[bfsQueueWrite++] = 1; // Adds starting square
    }
}
