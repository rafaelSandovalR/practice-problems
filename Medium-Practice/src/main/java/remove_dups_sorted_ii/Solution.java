/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remove_dups_sorted_ii;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int removeDuplicates(int[] nums){
        int count = 1, prev = nums[0], dupCount = 0;
        
        for(int i = 1; i < nums.length; i++){
            
            if (nums[i] != prev){
                nums[count++] = nums[i];
                prev = nums[i];
                dupCount = 0;
            } else {
                dupCount++;
                if (dupCount == 1) {
                    nums[count++] = nums[i];
                }
            }
        }
        
        return count;
    }
}
