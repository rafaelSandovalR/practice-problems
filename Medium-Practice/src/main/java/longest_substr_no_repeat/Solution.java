/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_substr_no_repeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


/**
 *
 * @author Rsand
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        List<String> letters = new ArrayList<String>();
        int maxLength = 0;
        int lastOccurence = 0;
        String currentChar;
        
                
        for(int i = 0; i < s.length(); i++){
            currentChar = String.valueOf(s.charAt(i));
            
            if (!letters.contains(currentChar)){
                letters.add(currentChar);

            } else{
                if (letters.size() > maxLength) {
                    maxLength = letters.size();
                }
                lastOccurence = letters.indexOf(currentChar);
                letters = letters.subList(lastOccurence+1, letters.size());
                letters.add(currentChar);
            }
        }

        if (letters.size() > maxLength) {
            maxLength = letters.size();
        }
        
        return maxLength;
    }
}
