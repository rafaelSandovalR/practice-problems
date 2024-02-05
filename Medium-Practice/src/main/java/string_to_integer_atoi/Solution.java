/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string_to_integer_atoi;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int myAtoi(String s){
        /*
            1. Read in and ignore any leading whitespace
            2. Check if the next character is '-' or '+' (if not already at the end of the string)
            3. Read in the next characters until the next non-digit character or end of input.
            4. Convert digits into an integer.
            5. If no digits are read then it is 0. Ignore non-digit characters.
            6. Integer must be 32 bit. 
            7. Return final result
        */
        
        if(s.isEmpty()) return 0;
  
        int result = 0, sign = 1, i = 0;
        boolean readingNumber = false;
        
        while(i < s.length() && s.charAt(i) == ' '){i++; }

        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = s.charAt(i++) == '-' ? -1: 1;
        }
        
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            if(result > Integer.MAX_VALUE/10 || 
                    (result == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > Integer.MAX_VALUE%10)){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE ;
            }
            result = result * 10 + (s.charAt(i++) - '0');
        }

        
        return result * sign;
    }
}
