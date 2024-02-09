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
        char char1, char2;
        int i = 0, j = s.length()-1;
        
        while(i<j){
            
            char1 = toLower(s.charAt(i));
            char2 = toLower(s.charAt(j));
            
            if (!isAlphaNum(char1)) {
                i++;
                continue;
            }
            if  (!isAlphaNum(char2)) {
                j--;
                continue;
            }
            
            if (char1 != char2) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
    
    public char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) ('a' + c - 'A');
        }
        return c;
    }
    
    public boolean isAlphaNum(char c){
        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
        
}
