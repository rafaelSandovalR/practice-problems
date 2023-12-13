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
        int output;
       
        
        while(s.length() > 0){
            firstLetter = s.charAt(0);
            boolean oneLetter = s.length() == 1;
            
            switch(String.valueOf(firstLetter)){
                case "I":
                break;
                case "V":
                break;
                case "X":
                break;
                case "L":
                break;
                case "C":
                break;
                case "D":
                break;
                case "M":
                break;
            }
        }
        
        return 0;
    }
}
