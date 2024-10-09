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

        dictionary.add("cats");
        dictionary.add("and");
        dictionary.add("sand");
        dictionary.add("dog");
        
        DPBottomUpSolution sol = new DPBottomUpSolution();
        boolean ans = sol.wordBreak("catsanddog", dictionary);
    }
    
}
