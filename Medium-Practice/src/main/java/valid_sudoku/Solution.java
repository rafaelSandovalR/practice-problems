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
        
        int row = 0, column = 0;
        
        while (row < 9){
            boolean[] rowOrColumn = new boolean[9];
            
            while (column < 9) {
                int charValue = Character.getNumericValue(board[row][column]);
                if (charValue < 0) {
                    column++;
                    continue;
                }
                if (rowOrColumn[charValue] == true) {
                    return false;
                }
                rowOrColumn[charValue] = true;

            }

            column = 0;
            row++;        
      
        }
        return true;
    }
}
