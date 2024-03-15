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

        char[] stack = new char[s.length()];
        int top = -1;
        
        for (char ch : s.toCharArray()){
            switch (ch){
                case '(':
                case '{':
                case '[':
                    stack[++top] = ch;
                    break;
                case ')':
                    if (top == -1 || stack[top--] != '(') return false;
                    break;
                case '}':
                    if (top == -1 || stack[top--] != '{') return false;
                    break;
                case ']':
                    if (top == -1 || stack[top--] != '[') return false;
                    break;
            }
        }
        
        return top == -1;
    }
}
