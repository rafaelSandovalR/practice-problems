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
        int count = 1, prev = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != prev){
                nums[count] = nums[i];
                prev = nums[i];
                count++;
            }
        }
        
        /*
        Alternate Solution with no prev variable
        ----------------------------------------
        
        int count = 0;
        
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
              
        return count+1;
        
        */
              
        return count;
    }
}
