/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permutations;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        
        Solution sol = new Solution();
        Solution2 sol2 = new Solution2();
        List<List<Integer>> res = sol2.permute(nums);
    }
}
