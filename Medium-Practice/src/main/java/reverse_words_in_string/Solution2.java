/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse_words_in_string;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    
    public String reverseWords(String s){
        char[] str = s.toCharArray();
        char[] rev = new char[str.length];
        // Return index after last character in 'rev' array, which equals number of characters in final output
        int charCount = getRevIdx(str, rev, 0); 
        return new String(rev, 0, charCount);
    }
    
    private int getRevIdx(char[] str, char[] rev, int start){
        while (start < str.length && str[start] == ' ') start++; // Set starting point
        
        int end = start; // Prep end pointer
        
        while (end < str.length && str[end] != ' ') end++; // Set end point
        
        if (start == end) return 0; // You've reached the last end of original string (start of reversed)
        
        int revIdx = getRevIdx(str, rev, end); // Determine pointer location to start inserting characters in 'rev' array
        
        if (revIdx != 0) rev[revIdx++] = ' '; // If not the start, add a space before adding next word
        
        while (start < end) rev[revIdx++] = str[start++]; // copy current word to proper 'rev' location
        
        return revIdx; // return current pointer location
    }
}
