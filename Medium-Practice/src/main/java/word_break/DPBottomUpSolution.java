/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_break;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class DPBottomUpSolution {
    public boolean wordBreak(String s, List<String> wordDict){
        
        // Create a DP table to store whether a substring ending at index i can be segmented
        boolean[] dp = new boolean[s.length()];
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++){
            // Iterate through each word in the dictionary
            for (String word : wordDict){
                int lastIndex = word.length() - 1;
                // Handle out of bounds case to prevent substring errors
                if (i < lastIndex) continue;
                
                // Check if the substring ending at i can be formed by adding the current word
                // to a previously segmented substring
                if (i == lastIndex || dp[i - word.length()]){
                    // Check if the substring from (i - word.length() + 1) to i matches the current word
                    if (s.substring(i - word.length() + 1, i + 1).equals(word)){
                        dp[i] = true; // Mark the substring ending at i as segmentable
                        break; // Move to the next character in the string
                    }
                }
            }
        }
        
        // Return whether the entire string (ending at index s.length() - 1) can be segmented
        return dp[s.length() - 1];
    }
}
