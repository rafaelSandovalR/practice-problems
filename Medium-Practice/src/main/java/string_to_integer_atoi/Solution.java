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
        
        int result = 0;
        int sign = 1;
        boolean readingNumber = false;

        
        for(int i=0; i < s.length(); i++){
            
            if(!readingNumber){

                switch (s.charAt(i)) {
                    case ' ':
                        continue;
                    case '-':
                        sign = -1;
                        readingNumber = true;
                        continue;
                    case '+':
                        readingNumber = true;
                        continue;
                }
                
                if (!Character.isDigit(s.charAt(i))) {
                    return 0;
                }
            }

            if (Character.isDigit(s.charAt(i))) {
                int currentDigit = Integer.parseInt(String.valueOf(s.charAt(i)));
                
                if(sign>0 && (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && currentDigit > 7))){return Integer.MAX_VALUE; }
                
                if(sign<0 && (result*sign < Integer.MIN_VALUE/10 || (result*sign == Integer.MIN_VALUE/10 && currentDigit > 8))){return Integer.MIN_VALUE; }
                
                result = (result * 10) + currentDigit;
                readingNumber = true;
            } else {
                break;
            }
       
        }

        
        return result * sign;
    }
}
