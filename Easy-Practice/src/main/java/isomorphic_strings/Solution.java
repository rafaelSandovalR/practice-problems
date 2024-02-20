/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isIsomorphic(String s, String t){

        int[] sFreq = new int[128];
        int[] tFreq = new int[128];
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++){
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            map.putIfAbsent(sChar, tChar);
            
            sFreq[sChar]++;
            tFreq[tChar]++;
            
            if (sFreq[sChar] != tFreq[tChar]) return false;
            if (map.get(sChar) != tChar) return false;
        }
        
        
        return true;

    }
}
