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
        int ones = 0; // Track bits that have appeared once (modulo 3)
        int twos = 0; // Track bits that have appeared twice (modulo 3)
        int n = nums.length;
        
        
        for (int i =0; i < n; i++){
            /*
            - XOR ones with nums[i] to toggle bits
            - Bitwise AND with ~twos to reset bits in 'ones' if they were 
                already in 'twos' (appeared twice)
            */
            ones = (ones ^ nums[i]) & ~(twos);
            
            /*
            - Update 'twos' based on the new value of 'ones'
            - XOR twos with nums[i] to toggle bits
            - Bitwise AND with ~ones to reset bits in 'twos' if they were
                already in 'ones' (appeared three times)
            */
            twos = (twos ^ nums[i]) & ~(ones);
        }
        
        return ones; // Return the bits that have appeared exactly once (the single number)
    }
}
