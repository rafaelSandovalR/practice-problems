/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_common_prefix;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Solution sol = new Solution();
        String ans = sol.longestCommonPrefix(strs);
    }
}
