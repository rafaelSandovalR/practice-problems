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
        int concatStart = 0;
        int wordStart = 0;
        

        String[] copy = Arrays.copyOf(words, words.length);
        Arrays.sort(copy);
        
        Map<String, Integer[]> test = new HashMap<>();
        
        test.put("good",new Integer[]{1,1});
        test.put("best",new Integer[]{1,1});
        test.put("word",new Integer[]{2,2});
        
        String t = "wordgoodbestword";
        
        int end = wordsLength;

        int numOfWords = 0;
        while(end < words.length){
            String check = t.substring(wordStart,end);
            
            if(test.containsKey(check) && test.get(check)[0] > 0){

                
                test.get(check)[0] -= 1;
                numOfWords++;
            } else {
                test.forEach((word, qty) -> qty[0] = qty[1] );
            }
            
            end += wordsLength;
        }
        
    }

}
