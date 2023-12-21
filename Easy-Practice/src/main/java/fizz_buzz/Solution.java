/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizz_buzz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>();
        
        for(int i = 1; i <= n; i++){
             
            if(i%3 == 0 && i%5 == 0){
                output.add("FizzBuzz");
            }
            else if(i%3 == 0){
                output.add("Fizz");
            }
            else if(i%5 == 0){
                output.add("Buzz");
            }
            else { output.add(Integer.toString(i)); }
            
        }
        return output;
    }
}
