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
        int[] stack = new int[tokens.length];
        int top = -1;
        int a = 0, b = 0;
        
        for (String token : tokens){
            switch(token){
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
                    stack[++top] = Integer.valueOf(token);   
            }
        }
        return stack[top];
    }
}
