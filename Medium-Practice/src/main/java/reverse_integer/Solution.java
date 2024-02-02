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
        
        int reverse = 0;
        
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)){return 0; }
            
            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)){return 0; }
            
            reverse = reverse * 10 + pop;
        }
        
        return reverse;
    }
}
