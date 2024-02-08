/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remove_dups_from_sorted_array;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int removeDuplicates(int[] nums){
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != nums[count]){
                nums[count] = nums[i];
                count++;
            }
        }
              
        return count == 0 ? 1: count;
    }
}
