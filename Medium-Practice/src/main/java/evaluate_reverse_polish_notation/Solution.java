/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluate_reverse_polish_notation;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int evalRPN(String[] tokens){
        int[] stack = new int[tokens.length]; // Int array representing a stack
        int top = -1; // Pointer indicating top of stack
        int a = 0, b = 0; // Operands
        
        // Iterate through all tokens
        for (String token : tokens){
            switch(token){
                // When token is an operator, 'b' is at the top of the stack 
                // followed by 'a'. Important for subtraction and division
                case "+" : 
                    b = stack[top--];
                    a = stack[top--];
                    stack[++top] = Integer.valueOf(a + b);
                    break;
                case "-" : 
                    b = stack[top--];
                    a = stack[top--];
                    stack[++top] = Integer.valueOf(a - b);
                    break;
                case "*" : 
                    b = stack[top--];
                    a = stack[top--];
                    stack[++top] = Integer.valueOf(a * b);
                    break;
                case "/" :
                    b = stack[top--];
                    a = stack[top--];
                    stack[++top] = Integer.valueOf(a / b);
                    break;
                default:
                    // If token is a numerical value, simply add it to the stack
                    stack[++top] = Integer.valueOf(token);   
            }
        }
        return stack[top];
    }
}
