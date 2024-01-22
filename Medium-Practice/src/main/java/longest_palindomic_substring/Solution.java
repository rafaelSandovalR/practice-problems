/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_palindomic_substring;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String longestPalindrome(String s){

        /*
            1. Compare current character to previous character
            2. If characters match:
                a. Update current size
                b. Check surrounding characters.
        */

        
    
        int startIndex = 0, endIndex = 0;
        int currentSize = 0, maxSize = 0;
        //flag for when in the middle of a palindrome check
        boolean checkIP = false;

        
        for (int forward = 1, reverse = 0; forward < s.length(); forward++){
                      
            //check to see if you're in the middle of an odd palindrome
            //only check when not in the middle of a palindrome traversal
            if(!checkIP && forward > 1 && s.charAt(forward) == s.charAt(reverse-1)){
                currentSize++;
                reverse--;
            }
            
            if(reverse >= 0 && s.charAt(forward) == s.charAt(reverse)){
                checkIP = true;
                //update size
                currentSize+=2;
                
                //update max and indices
                if (currentSize > maxSize) {
                    maxSize = currentSize;
                    startIndex = reverse;
                    endIndex = forward;
                }
                
                //move variable opposite from forward
                reverse--;
            }
            else{
                //Resets reverse var after any palindromic traversal
                reverse = forward;
                checkIP = false;
            }
            

        }
        
        
        return s.substring(startIndex, endIndex);
    
    }
}
