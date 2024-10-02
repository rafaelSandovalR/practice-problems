/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_break;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {

    
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<String>();
        //dictionary.add("leet");
        //dictionary.add("code");
        dictionary.add("aaaa");
        dictionary.add("aaa");
        
        Solution sol = new Solution();
        boolean ans = sol.wordBreak("aaaaaaa", dictionary);
    }
    
}
