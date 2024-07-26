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
        
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        Solution2 sol = new Solution2();
        Test test = new Test();
        
        List<Integer> answer = test.findSubstring(s, words);
        
    }
}
