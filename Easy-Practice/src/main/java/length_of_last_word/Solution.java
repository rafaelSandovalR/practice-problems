/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package length_of_last_word;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int lengthOfLastWord(String s){
        int start = s.length() - 1;
        
        // Loop to get 'start' to the end of the last word
        while (s.charAt(start) == ' '){
            start--;
        }
        
        int end = start; // Save index of the last character 
        
        // Loop to get 'start' to the start of the last word
        while (start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        
        return end - start; // Length of last word
    }
}
