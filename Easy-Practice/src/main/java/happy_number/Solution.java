/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package happy_number;

import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isHappy(int n){
        
        var found = new HashSet<Integer>();
        int sum = n;
        while (sum != 1){
            int newSum = 0;
            while (sum != 0){
                int digit = sum % 10;
                sum = sum / 10;
                newSum += digit * digit;
            }
            
            if (found.contains(newSum)) return false;
            found.add(newSum);
            sum = newSum;
        }
        
        return true;
    }
    
    // Alternate solution which relies on the fact that all un-happy numbers reach 4
    public boolean isHappyAlt(int n){
        while (n != 1 && n!= 4){
            n = sumf(n);
        }
        
        return n == 1;
    }
    
    private int sumf(int n){
        int sum = 0;
        
        while (n > 0){
            int x = n % 10;
            sum += x * x;
            n /= 10;
        }
        return sum;
    }
}
