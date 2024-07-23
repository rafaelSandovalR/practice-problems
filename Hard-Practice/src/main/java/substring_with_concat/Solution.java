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
        int count = 0;
        
        for (int start = 0, wordStart = 0, end = wordsLength; end < s.length(); wordStart += wordsLength, end += wordsLength){
            
            String currentWord = s.substring(wordStart,end);
            boolean wordFound = false;

            
            for (int i = 0; i < wordsQty; i++){
                if (!found[i] && currentWord.equals(words[i])){
                    found[i] = true;
                    wordFound = true;
                    count++;
                    break;
                }
            }
   
            if (!wordFound || count == wordsQty){
                if (count == wordsQty){
                    answer.add(start);
                }
                found = new boolean[wordsQty];
                start = end;
                count = 0;
            }
        }
        
        return answer;
        
        // (end - start) / wordsLength should be equal to count
    }

}
