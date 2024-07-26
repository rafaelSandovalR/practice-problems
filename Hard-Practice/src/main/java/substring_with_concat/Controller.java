/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package substring_with_concat;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        String s = "aaaaaaaaaa";
        String[] words = {"aa","aa"};
        Solution sol = new Solution();
        
        List<Integer> answer = sol.findSubstring(s, words);
        
    }
}
