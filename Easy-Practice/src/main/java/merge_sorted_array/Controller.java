/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_sorted_array;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        
        s.merge(nums1, 3, nums2, 3);
        
        System.out.println(nums1.toString());
    }
    
}
