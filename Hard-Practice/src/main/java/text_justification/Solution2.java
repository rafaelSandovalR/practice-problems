/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text_justification;

import java.util.*;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public List<String> fullJustify(String[] words, int maxWidth){
        List<String> fullJustified = new ArrayList<>();
        int i = 0, n = words.length;
        
        while (i < n){
            int lineLen = words[i].length();
            int j = i + 1; // Indicates start of next line
            
            // Step 1: Determine how many words fit in line
            while (j < n && lineLen + 1 + words[j].length() <= maxWidth){
                lineLen += 1 + words[j].length(); // include at least one space needed between words
                j++;
            }
            
            // Step 2: Build the line
            int gaps = j - i - 1; // Gaps is always one less than number of words
            StringBuilder line = new StringBuilder();
            
            // Case 1: Last line or only one word -> Left-justify
            if (j == n || gaps == 0){
                for (int k = i; k < j; k++){
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" "); // Fill rest of line with spaces
            } else {
                // Case 2: Fully Justify
                int totalSpaces = maxWidth - (lineLen - gaps);
                int baseSpaces = totalSpaces / gaps; // Minimum spaces between each word
                int extraSpaces = totalSpaces % gaps;  // Remaining spaces that need to be added from left to right
                
                for (int k = i; k < j;k++){
                    line.append(words[k]);
                    if (k < j - 1){
                        // k - i indicates gap index
                        // The first extraSpaces-number of gaps receive an extra space
                        for (int s = 0; s < baseSpaces + (k - i < extraSpaces ? 1 : 0); s++){
                            line.append(" ");
                        }
                    }
                }
            }
            
            fullJustified.add(line.toString());
            i = j;
        }
        
        return fullJustified;
    }
}
