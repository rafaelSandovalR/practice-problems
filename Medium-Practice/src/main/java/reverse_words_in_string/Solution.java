/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse_words_in_string;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String reverseWords(String s){
        StringBuilder reverse = new StringBuilder();
        
        for (int end = s.length()-1, start = end; start >= 0; end = start){
            while (end >=0 && s.charAt(end) == ' ') end--;
            
            start = end;
            if (end < 0) break;
            
            while (start >= 0 && s.charAt(start) != ' ') start--;
            
            reverse.append(s.substring(start+1, end+1)).append(" ");
        }
        reverse.deleteCharAt(reverse.length()-1);
        return reverse.toString();
    }
}
