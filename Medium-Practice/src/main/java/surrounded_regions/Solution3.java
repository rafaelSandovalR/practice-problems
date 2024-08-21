/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surrounded_regions;

/**
 *
 * @author Rsand
 */
public class Solution3 {
    public void solve(char[][] board){
        // Get the dimensions of the board
        int n = board.length;
        int m = board[0].length;
        
        // Replace all 'O's with '?' temporarily
        replace(board, 'O', '?');
        
        // Mark 'O's connected to the border as 'O'
        for (int x = 0; x < n; x++){
            replace(board, x, 0, '?','O');
            replace(board, x,m - 1,'?','O');
        }
        
        for (int y = 0; y < m; y++){
            replace(board, 0, y, '?','O');
            replace(board, n - 1, y, '?', 'O');
        }
        
        // Replace remaining '?'s with 'X' (surrounded regions)
        replace(board, '?','X');
    }
    
    // Recursive flood fill function to replace character in connected components
    private void replace(char[][] board, int x, int y, char charFrom, char charTo){
        int n = board.length;
        int m = board[0].length;
        
        if (x >= 0 && x < n && y >= 0 && y < m && board[x][y] == charFrom){
            board[x][y] = charTo;
            replace(board, x-1, y, charFrom, charTo); // Up
            replace(board, x+1, y, charFrom, charTo); // Down
            replace(board, x, y-1, charFrom, charTo); // Left
            replace(board, x, y+1, charFrom, charTo); // Right
        }
    }
    
    
    // Helper function to replace all occurrences of a character in the board
    private void replace(char[][] board, char charFrom, char charTo){
        int n = board.length;
        int m = board[0].length;
        
        for (int x = 0; x < n; x++){
            for (int y = 0; y < m; y++){
                if (board[x][y] == charFrom)
                    board[x][y] = charTo;
            }
        }
    }
}
