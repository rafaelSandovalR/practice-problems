/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_common_prefix;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String longestCommonPrefix(String[] strs){
        
        // Find the smallest string
        int smallest = 201;
        String prefix = "";
        
        for (String s : strs){
            if (s.length() < smallest){
                smallest = s.length();
                prefix = s;
            }
        }
        
        // For each string, determine common prefix
        int preLen = prefix.length();
        for (String s : strs){
            while(!s.substring(0, preLen).equals(prefix)){
                prefix = prefix.substring(0, --preLen);
                if (preLen == 0) return ""; // If no common prefix with current word, then no common prefix exists
            }
        }
        
        return prefix;
    }
}
