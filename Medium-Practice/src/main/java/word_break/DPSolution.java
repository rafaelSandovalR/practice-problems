/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_break;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class DPSolution {
    private String s;
    private List<String> wordDict;
    private int[] memo; // Memoization table to store results of subproblems
    
    private boolean dp(int end){
        // Base case: If the index goes below 0, it means a valid word break is found
        if (end < 0) return true;
        
        // If the result for this index is already memoized, return it
        if (memo[end] != -1) return memo[end] == 1;
        
        // Iterate through each word in the dicionary
        for (String word : wordDict){
            int prevEnd = end - word.length();
            int start = prevEnd + 1;
            
            // Handle out of bounds case to prevent substring errors
            if (start < 0) continue;
            
            // Check if the substring from (i - word.length() + 1) to i matches the current word
            // and if the remaining substring can also be segmented into dictionary words (recursive call)
            if (s.substring(start, end + 1).equals(word) && dp(prevEnd)){
                
                // Memoize the result as true (1)
                memo[end] = 1;
                return true;
            }
        }
        
        memo[end] = 0; // Memoize the result as false (0)
        return false;
    }
    
    
    public boolean wordBreak(String s, List<String> wordDict){
        this.s = s;
        this.wordDict = wordDict;
        this.memo = new int[s.length()];
        
        Arrays.fill(this.memo, -1); // Initialize memoization table with -1 (not calculated)
        return dp(s.length() - 1); // Start the recursive call from the last index;
    }
}
