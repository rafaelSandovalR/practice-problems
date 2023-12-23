/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps_to_zero;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int numberOfSteps(int num){
        int steps = 0;
        
        while(num > 0){
            if (num % 2 == 0) { num /= 2; } 
            else { num--; }
            
            steps++;
        }

        
        return steps;
    }
}
