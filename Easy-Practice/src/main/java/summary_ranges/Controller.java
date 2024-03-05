/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package summary_ranges;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {0,1,2,3,4,5};
        List<String> ans1 = sol.summaryRanges(nums1);
        
        int[] nums2 = {0,1,3,4,5,7,8,9,11};
        List<String> ans2 = sol.summaryRanges(nums2);
        
    }
}