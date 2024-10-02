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
 
        return verify(s, map, 0 , 1);
  
    }
    
    private boolean verify(String s, HashSet<String> map, int start, int end){
        
        
        if (start == s.length()) return true;
        boolean check = false;
        
        while (check == false && end <= s.length()){
            
            String subString = s.substring(start, end);
            
            if (map.contains(subString)) {
                check = verify(s, map, end, end + 1);
            }
            if (check == false)
                end++;
        }
        
        return check;
    }
}
