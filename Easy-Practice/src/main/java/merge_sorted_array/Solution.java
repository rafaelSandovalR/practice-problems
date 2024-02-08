/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_sorted_array;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        
        /*
            1. Set var ptr1 as length of usable numbers in first list
            2. Set var ptr2 as last index of second list
            3. Set var set as last index in first list
            4. While set is greater than 0
                a. if number in ptr1 is larger or equal, put it in the set index
                b. else put the number in ptr2 in the set index
                c. decrement set index
        */  
        
        int ptr1 = m-1, ptr2 = n-1;
        
        for(int set = m+n-1; set >= 0; set--){
            if(ptr1 < 0){
                nums1[set] = nums2[ptr2--];
            }
            else{
                nums1[set] = nums1[ptr1] >= nums2[ptr2] ? nums1[ptr1--] : nums2[ptr2--];           
            }
 
        }
    }
}
