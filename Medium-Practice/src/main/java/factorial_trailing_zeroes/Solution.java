/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial_trailing_zeroes;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int trailingZeroes(int n){
        /*
        int count = 0;
        while (n > 0){
            count += n / 5;
            n = n / 5;
        }
        return count;
        */
        int quotient = n / 5;
        int answer = quotient;
        int offset = 0;
        while ((quotient / 5) > 0){
           offset = quotient / 5;
           answer += offset;
           quotient = offset;
        }
        
        return answer;
    }
}
