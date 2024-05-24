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
        
        /**
         * The count[] array, indexed by square number, is used to contain both
         * the min number of moves to get to a square & also indicate if the
         * square has ever been visited before.
         * 
         * A value of zero indicates the square has NOT been visited yet.
         * 
         * A non-zero value indicates the square has been visited and that
         * value is 1 plus the minimum number of moves needed to get the square.
         * 
         * If a square has already been visited, we don't need to move there again.
         */
        
        byte[] count = new byte[endSquare + 1];
        count[1] = 1; // Mark the starting location as already visited.

        // Loop to get a next current square number from the BFS queue and move
        while (bfsQueueRead != bfsQueueWrite){
            int currSquare = bfsQueue[bfsQueueRead++];
            bfsQueueRead %= bfsQueueLen; // Logic for circular queue wrapping
            
            if (currSquare + 6 >= endSquare) return count[currSquare]; // When endsquare is within reach
            
            // Loop through all possible moves based off 6 sided dice
            int maxOpenMove = 0;
            for (int move = 6; move >= 1; move--){
                int nextSquare = currSquare + move;
                
                // Snake/Ladder handling
                if (brd[nextSquare] >= 0){
                    // Check if ladder sends you to the end, while assigning the value to nextSquare
                    if ((nextSquare = brd[nextSquare]) == endSquare) return count[currSquare];
                    
                    /**
                     * Else moved to an open square 1 to 6 moves ahead. Don't
                     * move to any open squares that are closer than the
                     * farthest open square we visited in the 1 to 6 moves
                     * ahead. For example, if we were able to move to an open
                     * square 5 moves ahead, then there is no reason to move to
                     * an open square that is 1,2,3, or 4 moves ahead. This does
                     * NOT apply to moving to any snakes or ladders that are 1
                     * to 6 moves ahead, and the snakes or ladders must be
                     * taken. This optimization can reduce the number of squares
                     * that are pushed onto the BFS queue, and saves the
                     * processing of those unnecessary squares.
                     */
                }
                else {
                    if (move < maxOpenMove) {
                        continue; // If already moved to open square skip through lesser moves
                    }
                    maxOpenMove = move;
                }

                /*
                    * If square not yet visited, then mark square as visited using the
                    * minimum number of moves to get to that square, and push that new
                    * square onto the BFS queue to later use as another square to move from.
                 */
                if (0 == count[nextSquare]) {
                    count[nextSquare] = (byte) (count[currSquare] + 1);
                    bfsQueue[bfsQueueWrite++] = (short) nextSquare;
                    bfsQueueWrite %= bfsQueueLen; // Logic for circular queue wrapping
                } 
            }
        }

            return -1; // Could not reach the end;
    }
}
