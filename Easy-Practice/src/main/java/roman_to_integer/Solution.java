/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roman_to_integer;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int romanToInt(String s){
        char firstLetter;
        int output = 0;
       
        
        while(s.length() > 0){
            firstLetter = s.charAt(0);
            boolean oneLetter = s.length() == 1;
            
            switch(String.valueOf(firstLetter)){
                case "I": output+=1;
                break;
                case "V": output+=5;
                break;
                case "X": output+=10;
                break;
                case "L": output+=50;
                break;
                case "C": output+=100;
                break;
                case "D": output+=500;
                break;
                case "M": output+=1000;
                break;
            }
            s = s.substring(1);
        }
        
        return output;
    }
}
