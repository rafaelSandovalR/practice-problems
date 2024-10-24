/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_window_substring;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String minWindow(String s, String t){
        String minSubString = "";
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        
        int[] count = new int[128];
        int[] foundCount = new int[128];
        
        int charCount = 0; // Holds the amount of distinct characters in 't'
        int charFound = 0; // Holds the amount of distinct characters found in window
        
        // Fill array with count of each character in 't'
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (count[c] == 0) charCount++; // If character hasn't been counted, increment charCount
            count[c]++;
        }
        
        // Sliding window loop
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (count[c] > 0){
                foundCount[c]++; // Update found
                
                // Increment count of fully accounted for characters
                if (foundCount[c] == count[c]){
                    charFound++;
                } else if (foundCount[c] > count[c]){ // If too many of 'c'

                    
                }
                
                // If all characters found and current substring length is less than minLen
                if (charFound == charCount && end - start < minLen){
                    minSubString = s.substring(start, end + 1); // Update result string
                }
            }
        }
        
        return minSubString;
    }
    
}
