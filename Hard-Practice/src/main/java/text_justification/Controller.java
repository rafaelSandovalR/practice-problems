/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text_justification;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"Science","is","what","we",
                    "understand","well","enough","to",
                    "explain","to","a","computer.","Art",
                    "is","everything","else","we","do"};
        List<String> ans = sol.fullyJustify(words, 20);
    }
}
