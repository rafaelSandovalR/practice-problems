/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_substr_no_repeat;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        Set<Character> letters = new HashSet<Character>();
        int maxLength = 0;
        int currentLength = 0;
        boolean added;
        
        
        /*
            1. From index 0:
                a. add letters to HashSet
            2. Check return val to determine if set already contains char
            3. If return val is true, increment currentLength
            4. If return val is false
                a. if currentLength > maxLength, set maxLength to currentLength
                b. reset currentLength
                c. create new set starting with current index
        */
        
        for(int i = 0; i < s.length(); i++){
            added = letters.add(s.charAt(i));
            
            if (added){
                currentLength++;
            } else {
                if (currentLength > maxLength){
                    maxLength = currentLength;
                }
                currentLength = 1;
                letters = new HashSet<Character>();
                letters.add(s.charAt(i));
            }
                
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        
        return maxLength;
    }
}
