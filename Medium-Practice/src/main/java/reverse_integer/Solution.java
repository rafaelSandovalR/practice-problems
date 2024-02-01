/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse_integer;

import java.util.Stack;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int reverse(int x){
        
        /*
            1. Create a stack to place each digit in lifo order and a stack for reverse
            2. Push each digit starting from the left, to the first stack
            3. Check that the reverse number is not >= INTMAX/10
                a. if over, return 0;
                b. if equals: check that the next pop is not over the last digit in the INTMAX
            4. Pop each digit and push it to the reverse stack
        */
        
        Stack<Integer> reverse = new Stack<Integer>();
        
        while(x > 0){
            int nextDigit = x % 10;
            reverse.push(nextDigit);
            
            x = x/10;
        }
        
        int stackSize = reverse.size();
        
        int result = 0;
        int nextDigit = 0;
        
        for(int i=0; i <= stackSize; i++){
            nextDigit = reverse.pop();
            
            if(result > Integer.MAX_VALUE / 10 || nextDigit > Integer.MAX_VALUE % 10){
                return  0;
            }

            
        }
        
        return 0;
    }
}
