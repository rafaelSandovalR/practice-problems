/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_search_data_structure;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        
        dictionary.addWord("a");
        dictionary.addWord("a");
        boolean res1 = dictionary.search(".");
        boolean res2 = dictionary.search("a");
        boolean res3 = dictionary.search("aa");
        boolean res4 = dictionary.search(".a");
        boolean res5 = dictionary.search("a.");
    }
}
