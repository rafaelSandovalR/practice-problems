/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single_number_ii;

/**
 *
 * @author Rsand
 */
public class Solution_2 {
    public int singleNumber(int[] nums){
        int ones = 0;
        int twos = 0;
        int n = nums.length;
        
        for (int i =0; i < n; i++){
            ones = (ones ^ nums[i]) & ~(twos);
            twos = (twos ^ nums[i]) & ~(ones);
        }
        
        return ones;
    }
}
