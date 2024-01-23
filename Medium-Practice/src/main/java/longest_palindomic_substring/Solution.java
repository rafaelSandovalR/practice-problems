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
                //Goes back one to check this value with surrounding
                if(checkIP){
                    forward--;
                }
                //Resets reverse var after any palindromic traversal
                reverse = forward;
                checkIP = false;
                currentSize = 0;
            }
        }
             
        return s.substring(startIndex, endIndex+1);
    
    }
}
