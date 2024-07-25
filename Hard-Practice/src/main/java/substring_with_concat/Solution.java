/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package substring_with_concat;

import java.util.ArrayList;
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
        
        int wordLength = words[0].length();
        int wordsQty = words.length;
        int windowSize = wordLength * wordsQty;
        int count = 0;
        
        Map<String, Integer> qtyMap = new HashMap<>();
        Map<String, Integer> foundMap = new HashMap<>();
        
        // Fill maps with words and their qty
        for (String word : words){
            if (qtyMap.containsKey(word)){
                qtyMap.put(word, qtyMap.get(word) + 1);
            } else{
                qtyMap.put(word, 1);
                foundMap.put(word, 0);
            }
        }
        

        for (int start = 0, currentStart = 0, currentEnd = wordLength, end = windowSize; end <= s.length(); start++, end = start + windowSize){
           
            String currentWord = s.substring(currentStart, currentEnd);
            
            while (qtyMap.containsKey(currentWord) && currentEnd <= end){
                int avail = qtyMap.get(currentWord);
                int currentQty = foundMap.get(currentWord) + 1;
                
                if (currentQty > avail){
                    break;
                }
                
                foundMap.put(currentWord, currentQty);
                currentStart += wordLength;
                currentEnd += wordLength;
                count++;
                
                if (count == wordsQty){
                    answer.add(start);
                    break;
                }
                
                currentWord = s.substring(currentStart, currentEnd);
            }
            
            count = 0;
            foundMap.replaceAll((key, value) -> 0);
            currentStart = start + 1;
            currentEnd = currentStart + wordLength;
            
        }
        
        return answer;
    }

}
