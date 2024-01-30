/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zigzag_conversion;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String convert(String s, int numRows){
        /*
            1.  Create a Matrix n*n/2+1
            2.  Input string characters down the row until nth row
            3.  Input string characters up the row until row 0
            4.  Continue this pattern for all characters of s
            5.  Create string using matrix, row by row.
        */
        
        int numColumns = s.length()/(Math.ceilDiv(numRows, 2));
        
        if(numRows == 1){return s; }
        
        char[][] matrix = new char[numRows][numColumns];
        
        for(int i = 0, row = 0, factor = 1, column = 0; i < s.length(); i++){
            
            if( i != 0 && (row == -1 || row == numRows) ){
                factor = factor * -1;
                column++;
                row = row + (2 * factor);
            }
            matrix[row][column] = s.charAt(i);
            row = row + factor;
    
        }
        
        StringBuilder str = new StringBuilder();
        
        for (int i = 0, row = 0, column = 0; i < (numColumns * numRows); i++) {
            if(matrix[row][column] != '\u0000'){
                str.append(matrix[row][column]);
            }
            
            column++;
            if(column == numColumns){
                column = 0;
                row++;
            }
        }
        
        
        return str.toString();
    }
}
