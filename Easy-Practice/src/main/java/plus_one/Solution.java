/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plus_one;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[] plusOne(int[] digits){
        
        /**
         * - Build actual integer of input
         * - Add 1
         * - Divide by size of input array + 1 to see if answer is a decimal place larger
         *      - if answer is 0, then output array is the same size
         *      - else output array is + 1 larger
         * - Build output array by using int / size of array
         *      - Then removing the most leftmost digit with % size of array
         */
        
        /**
         * Actual int = 99
         * add 1 = 100
         * Divide = 100 / 10 (10 ^ 2 cuz input array is size 2) = 10
         * 
         * 
         * Actual int = 98
         * add 1 = 99
         * Divide = 99 / 10 = 9
         */
    }
}
