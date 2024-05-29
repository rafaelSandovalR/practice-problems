/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letter_combinations_phone;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<String> letterCombinations(String digits){
        char[][] matrix = new char[digits.length()][];
        
        for (int i = 0; i < digits.length(); i++){
            switch(digits.charAt(i)){
                case 2: 
                    matrix[i] = new char[]{'a','b','c'};
                    break;
                case 3:
                    matrix[i] = new char[]{'d', 'e', 'f'};
                    break;
                case 4:
                    matrix[i] = new char[]{'g', 'h', 'i'};
                    break;
                case 5:
                    matrix[i] = new char[]{'j', 'k', 'l'};
                    break;
                case 6:
                    matrix[i] = new char[]{'m', 'n', 'o'};
                    break;
                case 7:
                    matrix[i] = new char[]{'p', 'q', 'r', 's'};
                    break;
                case 8:
                    matrix[i] = new char[]{'t', 'u', 'v'};
                    break;
                case 9:
                    matrix[i] = new char[]{'w', 'x', 'y', 'z'};
                    break;
            }
        }
    }
}
