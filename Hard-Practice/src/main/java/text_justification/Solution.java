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
        List<String> justifiedText = new ArrayList<String>();
        /*
            "Science  is  what we" MAX WIDTH = 20;
            widths = [7, 2, 4, 2]; total = 15;
            total spaces needed = 5;
            total places to add spaces = 3;
            
            int wordCount = line.length = 4;
            science ->  0 + 8 = 8;
            is      ->  8 + 3 = 11;
            what    ->  11 + 5 = 16;
            we      ->  16 + 3 = 19;
        
            letterCount = 19 - wordCount = 15;
            int totalSpaces = maxWidth - letterCount = 5;
            int spaces = (totalSpaces % (wordCount - 1)) = 2 <- max spaces from left;
            
            str.append(science);    add " " x Min(spaces, totalSpaces); totalSpaces -= spaces; (totalSpaces = 5 - 2 = 3)
            str.append(is);         add " " x Min(spaces, totalSpaces); totalSpaces -= spaces; (totalSpaces = 3 - 2 = 1)
            
        
            add one back to width;
                
        */
        
        /*
            "This   is   a  o" MAX WIDTH = 16;
            widths = [4, 2, 1, 1]; total = 8;
            total spaces needed = 8;
            total places to add spaces = 3;
        
            int wordCount = line.length = 4;
            
            letterCount = 0;
            this    ->  0 + 5 = 5;
            is      ->  5 + 3 = 8;
            a       ->  8 + 2 = 10;
            o       ->  10 + 2 = 12;
        
            letterCount = 12 - wordCount = 8;
            int totalSpaces = maxWidth - letterCount = 8;
            int spaces = (totalSpaces % (wordCount - 1)) =  3 <- how many spaces to add to left most words 
        
            str.append(this);   add " " x Min(spaces, totalSpaces); totalSpaces -= spaces; (totalSpaces = 8 - 3 = 5)
            str.append(is);     add " " x Min(spaces, totalSpaces); totalSpaces -= spaces; (totalSpaces = 5 - 3 = 2)
            str.append(a);      add " " x Min(spaces, totalSpaces); totalSpaces -= spaces; (totalSpaces = 2 - 3 = -1)
            str.append(o);
            
        */
        
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

            }
            // Build justified line
            int wordCount = line.size();
            int totalSpaces = maxWidth - letterCount;
            int maxSpaces = Math.ceilDiv(totalSpaces, wordCount-1); // CRASHES WHEN LINE CONSISTS OF ONE WORD
            
            for (int j = 0; j < wordCount - 1; j++){
                str.append(line.get(j));
                for (int k = 0; k < Math.min(maxSpaces, totalSpaces); k++){
                    str.append(" ");
                }
                totalSpaces -= maxSpaces;
            }
            str.append(line.get(wordCount-1));
            justifiedText.add(str.toString());
        }
        return justifiedText;
    }
}
