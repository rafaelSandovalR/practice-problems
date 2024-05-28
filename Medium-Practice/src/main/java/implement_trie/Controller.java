/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement_trie;

import java.util.Scanner;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
       Trie trie = new Trie();
       trie.insert("apple");
       boolean result1 = trie.search("apple");
       boolean result2 = trie.search("app");
       boolean result3 = trie.startsWith("app");
       trie.insert("app");
       boolean result4 = trie.search("app");
       
        

    }
}
