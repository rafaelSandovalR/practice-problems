/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_largest_in_array;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution_QuickSelect sol = new Solution_QuickSelect();
        Solution sol2 = new Solution();
        
        int[] nums = {3,2,1,5,6,4};
        int[] nums2 = {5,2,4,1,3,6,0};
        int[] nums3 = {-1,2,0};
        int ans = sol2.findKthLargest(nums3, 2);
    }
}
