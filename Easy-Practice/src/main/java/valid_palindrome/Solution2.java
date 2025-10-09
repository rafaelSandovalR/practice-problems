/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_palindrome;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public boolean isPalindrome(String s){
        int n = s.length(), left = 0, right = n-1;
        char[] str = s.toCharArray();
        
        while (left < right){
            if (!Character.isLetterOrDigit(str[left])){
                left++; continue;
            }
            if (!Character.isLetterOrDigit(str[right])){
                right--; continue;
            }
            
            if (Character.toLowerCase(str[left]) != Character.toLowerCase(str[right])) return false;
            
            left++; right--;
        }
        return true;
    }
}
