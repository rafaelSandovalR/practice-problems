/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Rsand
 */
public class BFS_Deque_Solution {
    public int snakesAndLadders(int[][] board){
        
        int end = board.length * board.length;
        boolean[] visited = new boolean[end + 1]; // Track explored squares
        Deque<Integer> queue = new ArrayDeque<>(); // For BFS exploration
        int moves = 0; // Min number of moves
        
        // Add starting square and mark as visited
        queue.offer(1);
        visited[1] = true;
        
        // BFS loop: Explore squares level by level
        while (!queue.isEmpty()){
            moves++; // Increment move count for each level
            int levelSize = queue.size(); // Number of squares to explore in the current level
            
            // Loop through all the squares in the current level
            for (int i = 0; i < levelSize; i++){
                int currentSquare = queue.poll(); // Get the next square from the queue (BFS Principle)
                boolean nextSquareAdded = false; // Flag to track added squares
                
                // Loop through all possible dice rolls (6 to 1) in reverse order
                for (int diceRoll = 6; diceRoll > 0; diceRoll--){
                    int nextSquare = currentSquare + diceRoll;
                    
                    if (nextSquare >= end) return moves; // If final square is reached, return min number of moves
                    if (visited[nextSquare]) continue; // Skip already explored squares
                    
                    int actualValue = getBoardValue(board, nextSquare); 
                    if (actualValue == end) return moves; // If next square has ladder to the end, return min number of moves
                    
                    // If its a regular square or the same as the next square
                    if (actualValue == -1 && !nextSquareAdded){
                        queue.offer(nextSquare); 
                        nextSquareAdded= true;
                    } else if (actualValue > 0){ // If snake or ladder
                        queue.offer(actualValue);
                    }
                    
                    visited[nextSquare] = true;
                }
            }
        }   
        
        return -1; // No path found to the destination
    }
    
    // Function to convert square number to actual row & column considering Boustrophedon style
    private int getBoardValue(int[][] board, int num) {
        int n = board.length;
        int r = (num - 1) / n; // Row number
        int x = n - 1 - r; // Actual row index based on Boustophedon style
        int y = r % 2 == 0 ? (num - 1 - r * n) : (n + r * n - num); // Column index based on even/odd row
        return board[x][y];
    }
}
