/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int snakesAndLadders(int[][] board){
        /*
        
        int thisNum = 1 ;
        int DivideByThisNum = 2;
        
        return thisNum%DivideByThisNum;
*/
        
        return minMoves(board, 7, board);
    }
    
    private int minMoves(int[][] board, int curr, int[][] memo){
        int n = board.length;
        if (curr == n * n){
            return 0;
        }
        
        // Check memoization table
        int[] coordinates = getCoordinates(curr, n);
        if (memo[coordinates[0]][coordinates[1]] != -1){
            //Fix this
            return memo[curr / board.length][curr % board.length];
        }
        
        // Initialize min moves
        
        // Check for snake or ladder
        
        // Store minimum moves for current square
        
        return n;
    }
    
    private int[] getCoordinates(int curr, int n){
        // Get canonical row
        int r = curr / n;
        // Get actual row based on Boustrophedon style
        int row = (n - 1) - r;
        
        // Get column based on even/odd row
        int c = curr % n;
        int col = r % 2 == 0 ? c - 1 : n - c;
        
        return new int[]{row, col};
    }    

}
