/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluate_reverse_polish_notation;

/**
 *
 * @author Rsand
 */
public class recursiveSolution {
    String[] str; // Stores the RPN tokens
    int len;      // Keeps track of the current token index
    
    public int evalRPN(String[] tokens){
        this.str = tokens;              // Initialize the string array
        this.len = tokens.length - 1;   // Start from the last token    
        return cal();
    }
    
    private int cal(){
        String ch = str[len--]; // Get the current token and decrement the index
        
        switch (ch){
            case "+": return cal() + cal();     // Recursively evaluate operands and add
            case "-": return -cal() + cal();    // Recursively evaluate, negate first, and add
            case "*": return cal() * cal();     // Recursively evaluate operands and multiply
            case "/":
                int x = cal();      // Recursively evaluate the second operand
                int y = cal();      // Recursively evaluate the first operand
                return y / x;       // Divide (Note the order due to RPN)
            default: return Integer.valueOf(ch); // If its a number, convert to integer
            
        }
    }
}
