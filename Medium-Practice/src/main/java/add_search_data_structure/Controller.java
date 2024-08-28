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
        
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        dictionary.search("pad");
        dictionary.search("bad");
        dictionary.search(".ad");
        dictionary.search("b..");
    }
}
