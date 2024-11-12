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
        
        for (String token : tokens){
            
            if (isNumeric(token)) {
                stack[++top] = Integer.valueOf(token);
                continue;
            }
            
            int calc = stack[top--];
            
            switch(token){
                case "+" : calc += stack[top--];
                break;
                case "-" : calc -= stack[top--];
                break;
                case "*" : calc *= stack[top--];
                break;
                case "/" : calc = stack[top--] / calc;
            }              
            
            stack[++top] = calc;
        }
        
        return stack[top];
    }
    
    private boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
