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
        
        /*
            1. Create two pointer vars. One to start at each end.
            2. Create var for count
            3. If ptr1 number equals val:
                a. increment count
                b. If ptr2 number equals val
                    i.  increment count
                    ii. decrement ptr2
                    iii. loop
                c. Swap ptr1 number with ptr2 number
                d. loop
            4. return count
            
        */
        
        int ptr1 = 0, ptr2 = nums.length-1, count = nums.length;
        
        while (ptr1 < ptr2){
            if (nums[ptr1] == val){
                count--;
                
                while(nums[ptr2] == val){
                    count--;
                    ptr2--;
                }
                
                nums[ptr1] = nums[ptr2];
                ptr2--;
            }
            
            ptr1++;
        }
        
        return count;
    }
}
