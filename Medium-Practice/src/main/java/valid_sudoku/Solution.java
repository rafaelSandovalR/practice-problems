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
       
        return areRowsValid(board) && areColumnsValid(board) && areSubBoxesValid(board);

    }
    
    private boolean areRowsValid(char[][] board){
        int row = 0, column = 0;

        while (row < 9) {
            boolean[] currentRow = new boolean[10];

            while (column < 9) {
                int charValue = Character.getNumericValue(board[row][column]);
                column++;
                if (charValue < 0) {
                    continue;
                }
                if (currentRow[charValue] == true) {
                    return false;
                }
                currentRow[charValue] = true;
            }

            column = 0;
            row++;

        }
        return true;
    }
    
    private boolean areColumnsValid(char[][] board){
        int row = 0, column = 0;

        while (column < 9) {
            boolean[] currentColumn = new boolean[10];

            while (row < 9) {
                int charValue = Character.getNumericValue(board[row][column]);
                row++;
                if (charValue < 0) {
                    continue;
                }
                if (currentColumn[charValue] == true) {
                    return false;
                }
                currentColumn[charValue] = true;
            }

            row = 0;
            column++;

        }
        return true;
    }
    
    private boolean areSubBoxesValid(char[][] board){
        
        int row = 0, column = 0, columnMin = 0, columnMax = 2, rowMin = 0, rowMax = 2;
        
        for(int boxRow = 0; boxRow < 3; boxRow++){
            
            for (int boxColumn = 0; boxColumn < 3; boxColumn++) {
                
                row = rowMin;
                column = columnMin;
                boolean[] subBoxCheck = new boolean[10];

                while (row >= rowMin && row <= rowMax) {

                    while (column >= columnMin && column <= columnMax) {
                        int charValue = Character.getNumericValue(board[row][column]);
                        column++;
                        if (charValue < 0) {
                            continue;
                        }

                        if (subBoxCheck[charValue] == true) {
                            return false;
                        }
                        subBoxCheck[charValue] = true;
                    }
                    row++;
                    column -=3;
                }
                columnMin += 3;
                columnMax +=3;
            }
            
            columnMin = 0;
            columnMax = 2;
            rowMin+=3;
            rowMax+=3;
        }
        
        return true;
    }
        
}
