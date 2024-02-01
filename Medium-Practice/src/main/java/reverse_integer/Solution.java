/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse_integer;

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
    }
}