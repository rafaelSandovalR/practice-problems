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
        
        int[] count = new int[32];

        for (int num : nums) {
            getCount(count, num);
        }

        int ans = 0;

        for (int i = 31; i >= 0 ; i--) {
            ans <<= 1;
            count[i] = count[i] % 3;
            ans += count[i]; 
        }

        return ans;
    }

    public void getCount(int[] count, int n) {

        for (int i = 0; i < 32; i++) {

            count[i] += n & 1; // If rightmost bit is 1, add 1 to result
            n >>= 1; // Shift n to the right to get the next digit
        }

    }

    /*  Only works for positive numbers
    
    private static int customLog(int base, int logNumber) {
        return (int) (Math.log(logNumber) / Math.log(base));
    }
    */
}
