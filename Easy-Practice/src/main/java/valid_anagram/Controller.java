/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_anagram;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s = "tears";
        String t = "stare";
        
        boolean ans = sol.isAnagram(s, t);
    }
}
