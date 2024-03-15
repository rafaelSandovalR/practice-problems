/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_parentheses;

import java.util.ArrayDeque;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++){

            char currentChar = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(currentChar);
                continue;
            }
            char topChar = stack.peek();
            
            switch (currentChar) {
                case ')':
                    if (topChar == '(') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (topChar == '{') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (topChar == '['){
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(currentChar);
            }
        }
        
        return stack.isEmpty();
    }
}
