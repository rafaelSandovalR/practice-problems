/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_parentheses;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        
        for (int i = 1; i < s.length(); i+=2){
            char prevChar = s.charAt(i-1);
            switch (s.charAt(i)){
                case ')':
                    if (prevChar != '(') return false;
                    break;
                case '}':
                    if (prevChar != '{') return false;
                    break;
                case ']':
                    if (prevChar != '[') return false;
                    break;
            }
        }
        
        return true;
    }
}
