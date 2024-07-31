/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_consecutive_sequence;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,9,8,4,6,0,1,10,11};
        
        Solution sol = new Solution();
        int ans = sol.longestConsecutive(nums);
    }
}
