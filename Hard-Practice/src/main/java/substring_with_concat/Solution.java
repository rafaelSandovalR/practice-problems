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

        for (int start = 0, current = 0, end = wordLength; end <= s.length(); current += wordLength, end += wordLength){
           
            String currentWord = s.substring(current, current + wordLength);
            int qtyAvail = qtyMap.get(currentWord);
            
            
            if (qtyMap.containsKey(currentWord)){
                int currentQty = foundMap.get(currentWord) + 1;
                foundMap.put(currentWord, currentQty);
                count++;
                
                while (currentQty > qtyAvail){
                    String startingWord = s.substring(start, start + wordLength);
                    foundMap.put(startingWord, foundMap.get(startingWord) - 1);
                    start += wordLength;
                    currentQty = foundMap.get(currentWord);
                    count--;
                }
            }
            
            if (count == wordsQty){
                answer.add(start);
            }
        }
        
        return answer;
        
        // (end - start) / wordsLength should be equal to count
    }

}
