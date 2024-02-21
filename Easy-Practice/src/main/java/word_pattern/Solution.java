/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_pattern;

import java.util.HashMap;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean wordPattern(String pattern, String s){
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;
        
        int i = 0;            
        for (char c : pattern.toCharArray()){
            
            if (map.containsKey(c)){
                if (!map.get(c).equals(words[i])) return false;
            }
            else if (map.containsValue(words[i])) return false;
                
            map.put(c, words[i++]);
        }
        
        return true;
    }
}
