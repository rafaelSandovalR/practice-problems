/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single_number_ii;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int singleNumber(int[] nums){
        
        // Count the number of times each bit is set across all numbers
        int[] count = new int[32]; // 32 bits for integer representation
        for (int num : nums) {
            getCount(count, num);
        }

        int ans = 0;

        // Reconstruct the single number from the bit counts
        for (int i = 31; i >= 0 ; i--) {
            ans <<= 1; // Left shift ans by 1 (multiply by 2) to make space for next bit
            count[i] = count[i] % 3; // Mod 3 to remove all multiples of 3: results in either 0 or 1
            ans += count[i]; // Add the current bit value to the result
        }

        return ans;
    }

    // Helper method to count the set bits for each position in a number
    public void getCount(int[] count, int n) {

        for (int i = 0; i < 32; i++) {
            count[i] += n & 1; // If rightmost bit is 1, add 1 to result
            n >>= 1; // Shift n to process the next bit
        }

    }

    /*  Only works for positive numbers
    
    private static int customLog(int base, int logNumber) {
        return (int) (Math.log(logNumber) / Math.log(base));
    }
    */
}
