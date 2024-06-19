/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindrome_number;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) return false;
        if (x <= 9) return true;
        
        // Figure out the most significant factor
        int high = 0;
        for (int i = 1, res = x; res > 9; i++){
            res /= 10;
            high = i;
        }
        
        high = (int)Math.pow(10, high);
        
        int reverse = 0;
        for (int res = x; res > 0; res /= 10, high /= 10) {
            reverse += (res % 10) * high;
        }
        
        
        /*
        
        for (int low = 10, i = 1; low <= high; low *= 10, high /= 10, i*=10){
            int front = (x % low) / i;
            int back = Math.max(x/high, (x/high) % i);
            
            if (front != back) return false;
            x = x % high;
        }
        */
        
        return x == reverse;
    }
}
