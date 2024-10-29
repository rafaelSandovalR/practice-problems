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
        for (int start = -1, end = 0; end < s.length(); end++){
            char c = s.charAt(end); // c is character at end
            if (count[c] > 0){
                if (start == -1) start = end; // Set first starting point
                foundCount[c]++; // Update found count
                
                // Increment count of fully accounted for characters
                if (foundCount[c] == count[c]) charFound++;
                
                // If substring contains at least the same chars as in 't'
                if (charFound == charCount){
                    
                    // Truncate prefix as much as possible while still being a valid substring
                    // start can be moved if starting char was found more than enough OR its not a valid char
                    c = s.charAt(start); // c is character at start
                    while (foundCount[c] > count[c] || count[c] == 0){
                        if (count[c] > 0) foundCount[c]--; // Subtract char from found if valid
                        c = s.charAt(++start);
                    }
                    
                    // Update min string/len if smaller than previous
                    if (end - start < minLen){
                        minSubString = s.substring(start, end + 1); // Update result string
                        minLen = end - start;
                    }
                    
                    // Update charFound (if applicable) & foundCount due to truncating starting character
                    if (foundCount[c] == count[c]) charFound--;
                    foundCount[c]--;              

                    // Move start to next valid character if possible
                    if (start < end) c = s.charAt(++start);
                    while (count[c] == 0 && start < end) {
                        c = s.charAt(++start);
                    }
                }
            }
        }
        
        return minSubString;
    }
    
}
