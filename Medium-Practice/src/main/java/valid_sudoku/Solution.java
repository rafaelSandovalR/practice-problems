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
        /*
            1. Make boolean array 0-9, to determine if duplicates exist within
                3x3 grid
            2. Check that no duplicates exist in first row, and that valid digits
                - save first three items (if any)
            3. Check that no duplicates exist in first column, and valid
                - save 2nd and 3rd item (if any)
            4. Check that no duplicates exist in second row, and valid
                - save 2nd and 3rd item (if any)
            5. Do same step as step 4 for second column, third row, third column
            6. For each loop return false if duplicates exist in column or duplicates
                exist in saved items.
            7. clear saved items.
            8. Check for dups and valid for fourth, fifth and sixth columns
                - save items
            9. For each loop return false if duplicates exist
            10. Repeat steps 8 & 9 for sixth, seventh and eight column
            11. Check for dups in rows 3, 4, 5
            12. Check for dups in middle quadrant
            13. check for dups in middle, right quadrant
            14. check for dups in bottom left quadrant,
            15. check for dups in bottom middle quadant
            16. check for dups in bottom right quadrant.
        */
        
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
        
        int row = 0, column = 0, min = 0, max = 2;
        
        for(int subBox = 0; subBox < 9; subBox++){
        
            boolean[] subBoxCheck = new boolean[10];
            
            while (row >= min && row <= max){
                
                while (column >= min && column <= max){
                    int currentValue = Character.getNumericValue(board[row][column]);
                    
                    if (subBoxCheck[currentValue] == true) return false;
                    column++;
                }
            }
            
        }
        
        return true;
    }
        
    }
}
