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
            1. Create array of size of s, to hold new string
        
            2. Create var nextRow as pointer to return to after each "row"
                Create var outputIndex to fill array of output string
                Cteate var ptr to point to next char in sequence
                Create var width to determine space between characters each loop
                    width = 2*numRows - 2.
                Create var invertWidth = 0;
        
        
            3. Loop for as many characters in s
                a. after first row, width = width - 2
        
                b. place s.charAt(ptr) in array[ouputIndex++]
        
                b. While ptr + width < size of s
                    If less than last index: place s.charAt(ptr) in array[outputIndex++]
                    If ptr + invertWidth  < size of s AND invertWidth > 0
                        If less than last index: place s.charAt(ptr) in array[outputIndex++]

                c. pointer = ++nextRow;       
                d. invertWidth + 2;
        */
        
        return "";
    }
}
