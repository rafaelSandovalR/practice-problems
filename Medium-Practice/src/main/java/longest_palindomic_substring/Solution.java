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
            1. Work on string itself
            2. Set index var to size of string - 1
            3. Create vars for:
                a. prev
                b. preprev
                c. maxSize
                d. currentSize
                e. Starting Index
                b. Ending Index
            4. For the size of the string
                b. if currentChar is equals to prevChar AND prevIndex > 0
                    i. currentSize = 2
                    ii. while nextChar equals prevChar--
                        1. currentSize++
                        2. startingIndex = prev
                        3. endingIndex = next
                c. if currentChar is equals to prePrevChar AND prevIndex > 0
                    i. currentSize = 3
                    ii. while nextChar equals 4xprev char--
                        1. currentSize++
                        2. startingIndex = prev
                        3. endingIndex = next
                d. Set max to max(max, currentsize)
            5. Return max
        */
        
        int size = s.length();
        int currentSize = 1, maxSize = 0;
        int startIndex, endIndex;
        
        for (int i = 1, prev = 0; i < size; i++){
            if (prev > 0 && s.charAt(i) == s.charAt(prev)){
                currentSize++;
                startIndex = prev;
                while (i < size && s.charAt(++i) == s.charAt(--prev)){
                    currentSize++;
                    endIndex = i; 
                }
            }
            if (prev > 0 && s.charAt(i) == s.charAt(prev-1)){
                currentSize++;
                startIndex = prev;
                while (i < size && s.charAt(++i) == s.charAt(--prev)){
                    currentSize++;
                    endIndex = i;
                }
            }
            
            maxSize = Math.max(maxSize, currentSize);
        }
        
    
    }
}
