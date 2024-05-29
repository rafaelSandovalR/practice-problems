/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letter_combinations_phone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    private static final String[] LETTERS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans; // Base case for empty input
        
        getCombo(digits, 0, new StringBuilder(), ans);
        
        return ans;
    }
    
    private void getCombo(String digits, int index, StringBuilder current, List<String> result){
        if (index == digits.length()){ // Base Case: processed all digits
            result.add(current.toString());
            return;
        }
               
        String letters = LETTERS[digits.charAt(index) - '0']; // Look up the letters for current digits
        
        for (int i = 0; i < letters.length(); i++){
            current.append(letters.charAt(i)); // Add letter to combination
            getCombo(digits, index + 1, current, result); // Recursive for the next digit
            current.deleteCharAt(current.length() - 1); // Backtrack: remove the added letter
        }
    }
}
