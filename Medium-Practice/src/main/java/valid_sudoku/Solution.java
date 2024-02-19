/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_sudoku;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isValidSudoku(char[][] board){
        int N = 9;
        
        // Use an array to record the status
        boolean[][] rows = new boolean[N][N];
        boolean[][] cols = new boolean[N][N];
        boolean[][] boxes = new boolean[N][N];
        
        for (int r = 0; r < N; r++){
            for (int c = 0; c < N; c++){
                
                // Check if the position is filled with number
                if (board[r][c] == '.'){
                    continue;
                }
                int pos = board[r][c] - '1';
                
                // Check the row
                if (rows[r][pos] == true){
                    return false;
                }
                rows[r][pos] = true;
                
                // Check the column
                if (cols[c][pos] == true){
                    return false;
                }
                cols[c][pos] = true;
                
                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx][pos] == true){
                    return false;
                }
                boxes[idx][pos] = true;
            }
        }
        return true;
    }
    
        
}
