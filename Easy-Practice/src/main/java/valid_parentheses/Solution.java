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
            
            switch (s.charAt(i)) {
                case ')':
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.peek() == '['){
                        stack.pop();
                    }
                    break;
                default:
                    return false;
            }
        }
        
        return stack.isEmpty();
    }
}
