/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package substring_with_concat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<Integer> findSubstring(String s, String[] words){
        List<Integer> answer = new ArrayList<>();
        
        int wordsLength = words[0].length();
        int wordsQty = words.length;
        boolean[] found = new boolean[wordsQty];
        int[] order = new int[wordsQty];
        int orderCount = 0;
        int count = 0;
        
        for (int start = 0, wordStart = 0, end = wordsLength; end < s.length(); wordStart += wordsLength, end += wordsLength){
            
            String currentWord = s.substring(wordStart,end);
            boolean wordFound = false;

            // Check if word can be added to concat
            for (int i = 0; i < wordsQty; i++){
                if (!found[i] && currentWord.equals(words[i])){
                    found[i] = true;
                    wordFound = true;
                    count++;
                    order[i] = orderCount++;
                    break;
                }
            }
  
            // Reset
            if (!wordFound){
                found = new boolean[wordsQty];
                order = new int[wordsQty];
                start = wordStart;
                
                if (count > 0){
                    start = wordStart;
                    wordStart -= wordsLength;
                    end -= wordsLength;
                }

                count = 0;
            }
            
            // If all words found
            if (count == wordsQty){
                answer.add(start);
                start += wordsLength;
                count--;
                int first = 0;
                
                for (int i = 0; i < wordsQty; i++){
                    if (order[i] < order[first]){
                        first = i;
                    }                
                }
                order[first] = orderCount++;
                found[first] = false;  
            }
        }
        
        return answer;
        
        // (end - start) / wordsLength should be equal to count
    }

}
