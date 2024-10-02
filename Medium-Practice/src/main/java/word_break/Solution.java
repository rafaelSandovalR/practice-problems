/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_break;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict){
        
        // Use set for easy lookup
        var map = new HashSet<String>();
        
        // Add all words to set
        for (String word : wordDict){
            map.add(word);
        }
        

        int start = 0;
        int end = 1;
        
        while (end < s.length()){
            
            String check = s.substring(start,end);
            
            while (!map.contains(check) && end < s.length() - 1){
                check = s.substring(start, ++end);
            }
            
            if (!map.contains(check)) return false;
            
            start = end + 1;
            end++;
        }
        
        return true;
        
    }
}
