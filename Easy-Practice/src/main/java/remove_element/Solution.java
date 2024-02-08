/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remove_element;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int removeElement(int[] nums, int val){
                
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
