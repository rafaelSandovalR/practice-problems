/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surrounded_regions;

import java.util.ArrayList;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void solve(char[][] board){
        
        int rows = board.length - 1;
        var revert = new ArrayList<int[]>();
        
        for (int row = 1; row < rows; row++){
            check(board,row, revert);
        }
        
        for (int[] coordinates : revert){
            bfsRevert(board, coordinates[0], coordinates[1]);
        }
    }
    
    private void check(char[][] board, int r, ArrayList<int[]> revert){
        int columns = board[0].length - 1;
        final char[] row = board[r];
        
        for (int col = 1; col < columns; col++){
            boolean[] canSurround = {true};
            var temp = new ArrayList<int[]>();
            if (row[col] == 'O'){
                bfs(board, r, col, canSurround, temp);
                

                if (canSurround[0]){
                    for (int[] coordinates : temp){
                        int x = coordinates[0];
                        int y = coordinates[1];
                        board[x][y] = 'X';
                    }
                }else revert.add(new int[]{r, col}); // Save initial coordinate for land that can't be surrounded
            }
        }
    }
    
    private void bfs(char[][] board, int row, int col, boolean[] canSurround, ArrayList<int[]> temp){
        int rows = board.length;
        int columns = board[0].length;
        
        // If at the edge, set flag to false;
        if (row == 0 || row == rows-1 || col == 0 || col == columns-1) canSurround[0] = false; 
        
        temp.add(new int[] {row, col}); // Add all coordinates to temp list
        
        board[row][col] = 'Z'; // Change all values to Z by default
        
        if (row > 0 && board[row-1][col] == 'O')            bfs(board, row-1, col, canSurround, temp);
        
        if (row+1 < rows && board[row+1][col] == 'O')       bfs(board, row + 1, col, canSurround, temp);
        
        if (col > 0 && board[row][col-1] == 'O')            bfs(board, row, col-1, canSurround, temp);
        
        if (col+1 < columns && board[row][col+1] == 'O')    bfs(board, row, col+1, canSurround, temp);
        
        // If land can be surrounded, change value to X
        //if (canSurround[0]) board[row][col] = 'X';
    }
    
    private void bfsRevert(char[][] board, int row, int col){
        int rows = board.length;
        int columns = board[0].length;
        
        board[row][col] = 'O'; // Change all values back to O
        
        if (row > 0 && board[row-1][col] == 'Z')            bfsRevert(board, row-1, col);
        
        if (row+1 < rows && board[row+1][col] == 'Z')       bfsRevert(board, row + 1, col);
        
        if (col > 0 && board[row][col-1] == 'Z')            bfsRevert(board, row, col-1);
        
        if (col+1 < columns && board[row][col+1] == 'Z')    bfsRevert(board, row, col+1); 
    }
}
