/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int snakesAndLadders(int[][] board){
        
        int[][] memo = new int[board.length][board.length];
        for (int i = 0; i < memo.length; i++){
            for (int j = 0; j < memo.length; j++){
                memo[i][j] = -1;
            }
        }
        
        return minMoves(board, 1, memo, new HashSet<>());
    }
    
    private int minMoves(int[][] board, int curr, int[][] memo, Set<Integer> visited){
        int n = board.length;
        if (curr == n * n){
            return 0;
        }
        
        // Check memoization table
        int[] coordinates = getCoordinates(curr, n);
        int row = coordinates[0];
        int col = coordinates[1];
        if (memo[row][col] != -1){
            return memo[row][col];
        }
        
        // Initialize min moves
        int minMoves = Integer.MAX_VALUE;
        for (int next = curr + 1; next <= Math.min(curr + 6, n * n); next++){
            
            if (visited.contains(next)) continue; // Skip visited squares to avoid cycles
            visited.add(next); // Mark the next square as visited
            
            int[] nextCoordinates = getCoordinates(next, n);
            int nextRow = nextCoordinates[0];
            int nextCol = nextCoordinates[1];
            
            // Check for snake or ladder
            if (board[nextRow][nextCol] != -1){
                minMoves = Math.min(minMoves, 1 + minMoves(board, board[nextRow][nextCol], memo, visited));
            } else{
                minMoves = Math.min(minMoves, 1 + minMoves(board, next, memo, visited));
            }
            
            visited.remove(next); // Remove the square for visited after exploring its possibilites
        }
        
        // Store minimum moves for current square
        memo[row][col] = minMoves;
        
        return minMoves;
    }
    
    private int[] getCoordinates(int curr, int n){
        // Get canonical row & col
        int r = curr / n;
        int c = curr % n;
        
        // Get actual row based on Boustrophedon style & if remainder exists
        int row = c != 0 ? (n - 1) - r : n - r;
        
        int col;
        // Get actual column based on even/odd row & if remainder exists
        if (c == 0){
            // If no remainder, it's either the first or last column
            col = r % 2 == 0 ? 0 : n - 1;
        } else {
            col = r % 2 == 0 ? c - 1 : n - c;
        }

        //System.out.println("Coordinates : [" + row + "] [" + col + "]");
        return new int[]{row, col};
    }    

}
