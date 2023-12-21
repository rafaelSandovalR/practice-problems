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
        boolean divBy3=false, divBy5=false;
        
        for(int i = 1; i <= n; i++){
            
            if(divBy3 && divBy5){
                output.add("FizzBuzz");
            }
            else if(divBy3){
                output.add("Fizz");
            }
            else if(divBy5){
                output.add("Buzz");
            }
            else { output.add(String.valueOf(i)); }
        }
        return output;
    }
}
