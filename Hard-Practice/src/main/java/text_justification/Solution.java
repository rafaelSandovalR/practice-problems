/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text_justification;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<String> fullyJustify(String[] words, int maxWidth){
        int n = words.length, i = 0;
        boolean lastLine = false;
        List<String> justifiedText = new ArrayList<>();
        
        while (i < n){
            int width = maxWidth, letterCount = 0;
            StringBuilder str = new StringBuilder();
            List<String> line = new ArrayList<>();
            // Determine all words that fit in one line
            while (i < n && width >= 0) {
                if (width - words[i].length() < 0) break;
                letterCount += words[i].length();
                line.add(words[i]);
                width -= words[i++].length() + 1; // You need at least one space between words
                if (i == n) lastLine = true;
            }
            // Build justified line
            int wordCount = line.size(), totalSpaces = maxWidth - letterCount;
            
            for (int j = 0; j < wordCount - 1; j++){
                // Handle last line
                int maxSpaces = lastLine ? 1 : 
                          wordCount == 1 ? 0 : Math.ceilDiv(totalSpaces, wordCount - 1 - j);
                
                str.append(line.get(j));
                for (int k = 0; k < Math.min(maxSpaces, totalSpaces); k++){
                    str.append(" ");
                }
                totalSpaces -= maxSpaces;
            }
            str.append(line.get(wordCount-1));
            
            // Handle single word lines or last line
            if (wordCount == 1 || lastLine){
                for (int k = 0; k < totalSpaces; k++){
                    str.append(" ");
                }
            }
            
            justifiedText.add(str.toString());
        }

        return justifiedText;
    }
}
