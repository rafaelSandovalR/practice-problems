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
            
        
        */
        int thisNum = 1 ;
        int DivideByThisNum = 2;
        
        return thisNum%DivideByThisNum;
    }
    
    private int minMoves(int[][] board, int curr, int[][] memo){
        int n = board.length;
        if (curr == n * n){
            return 0;
        }
        
        // Check memoization table
        int row = getRow(curr, n);
        int col = getCol(curr, n);
        if (memo[curr / board.length][curr % board.length] != -1){
            return memo[curr / board.length][curr % board.length];
        }
        
        // Initialize min moves
        
        // Check for snake or ladder
        
        // Store minimum moves for current square
        
        return n;
    }

    private int getRow(int curr, int n) {
       int row = (curr - 1) / n;
       return row;
    }
    
    private int getCol(int curr, int n) {
        int col = (curr - 1) % n;
        return col;
    }
    

}
