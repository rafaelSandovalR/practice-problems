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
        
        return minMoves(board, 9, board);
    }
    
    private int minMoves(int[][] board, int curr, int[][] memo){
        int n = board.length;
        if (curr == n * n){
            //return 0;
        }
        
        // Check memoization table
        int[] coordinates = getCoordinates(curr, n);
        if (memo[coordinates[0]][coordinates[1]] != -1){
            //Fix this
            return coordinates[0];
        }
        
        // Initialize min moves
        
        // Check for snake or ladder
        
        // Store minimum moves for current square
        
        return n;
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

        System.out.println("Coordinates : [" + row + "] [" + col + "]");
        return new int[]{row, col};
    }    

}
