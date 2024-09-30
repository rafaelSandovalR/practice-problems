/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_x;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int mySqrt(int x){
        int left = 0;
        int right = x;
        int middle = -1;
        
        // Conduct simple binary search across integers between 0 and x
        while (left <= right){
            middle = left + (right - left) / 2;
            
            // Cast into long to prevent integer overflow
            long middleSquared = (long) middle * (long) middle;
            
            if (middleSquared == x) return middle;
            else if (middleSquared < x){
                left = middle + 1;
            } else{
                right = middle - 1;
            }
        }
        
        // Ensure the square root is rounded down
        if (middle * middle > x){
            middle--;
        }
        
        return middle;
    }
}
