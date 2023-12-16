/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roman_to_integer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */ 
public class Solution {
    public int romanToInt(String s){
        char firstLetter = 'i';
        int output = 0;
        boolean doubleChar = false;

        while(s.length() > 0){
            firstLetter = s.charAt(0);
            boolean oneLetter = s.length() == 1;    

            switch(String.valueOf(firstLetter)){
                case "I":
                    doubleChar = true;
                    if(!oneLetter && s.charAt(1) == 'V'){ output += 4; }
                    else if (!oneLetter && s.charAt(1) == 'X'){ output += 9; }
                    else {output += 1; doubleChar = false; }
                    break;
                case "V": output += 5;
                    break;
                case "X":
                    doubleChar = true;
                    if(!oneLetter && s.charAt(1) == 'C'){ output += 90; }
                    else if (!oneLetter && s.charAt(1) == 'L'){ output += 40; }
                    else {output += 10; doubleChar = false; }
                    break;
                case "L": output += 50;
                    break;
                case "C":
                    doubleChar = true;
                    if(!oneLetter && s.charAt(1) == 'M'){ output += 900; }
                    else if (!oneLetter && s.charAt(1) == 'D'){ output += 400; }
                    else {output += 100; doubleChar = false; }
                    break;
                case "D": output += 500;
                    break;
                case "M": output += 1000;
                    break;
            }
            if(doubleChar){ s = s.substring(2); }
            else { s = s.substring(1); }
            doubleChar = false;
        }

        return output;
    }
    
    public int romanToInt2(String s){
/*  INTUITION:  Reading a roman numeral left to right, when a number is less
                the following one, it means subtraction. When a number is more
                than the following one, it means addition.
        
        IV VI
*/
    int output = 0;
    Map<Character, Integer> m = new HashMap<>();
     m.put('I', 1);
     m.put('V', 5);
     m.put('X', 10);
     m.put('L', 50);
     m.put('C', 100);
     m.put('D', 500);
     m.put('M', 1000);
     
     
     for(int i=0; i < s.length()-1 && s.length() > 1; i++){
         if(m.get(s.charAt(i)) >= m.get(s.charAt(i+1))) {output+=m.get(s.charAt(i)); }
         else {output -= m.get(s.charAt(i)); }
     }
     
     //this catches single character strings and the last character.
     output += m.get(s.charAt(s.length()-1));
     
     return output;
    }
}


