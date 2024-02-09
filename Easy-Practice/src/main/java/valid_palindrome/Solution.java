/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_palindrome;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isPalindrome(String s){
        
        if(s.length() == 1) return true;

        char char1, char2;
        int charCount = 0;
        int i = 0, j = s.length()-1;
        boolean atLeastOneCharacter = false;
        
        while(i<j){
            
            char1 = Character.toLowerCase(s.charAt(i));
            char2 = Character.toLowerCase(s.charAt(j));
            
            while (!isAlphanumeric(char1) && i < j - 1) {
                char1 = s.charAt(++i);
            }
            while (!isAlphanumeric(char2) && j > i + 1) {
                char2 = s.charAt(--j);
            }
            
            if(!atLeastOneCharacter && (isAlphanumeric(char1) || isAlphanumeric(char2))){
                atLeastOneCharacter = true;
            }

            if (isAlphanumeric(char1) && isAlphanumeric(char2)) {
                charCount++;

                if (char1 != char2) {
                    return false;
                }
            }

            i++;
            j--;
        }
        
        return (charCount > 0 || atLeastOneCharacter);
    }
    
    public boolean isAlphanumeric(char c){
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
        
}
