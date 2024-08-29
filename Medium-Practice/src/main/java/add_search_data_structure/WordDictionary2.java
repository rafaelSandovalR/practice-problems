/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_search_data_structure;

/**
 *
 * @author Rsand
 */
public class WordDictionary2 {
    
    private class TrieNode{
        TrieNode[] children;
        boolean isEndOfWord;
        
        public TrieNode(){
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
    
    private TrieNode root;
    
    public WordDictionary2(){
        root = new TrieNode();
    }
    
    public void addWord(String word){
        TrieNode node = root;
        // Add word to Trie letter by letter
        for (char ch : word.toCharArray()){
            int index = ch -'a'; // Index representing current character
            // If parent node does not have a node for this character, create new node
            if (node.children[index] == null){
                node.children[index] = new TrieNode();
            }
            node = node.children[index]; // Set node for this character as the new parent
        }
        node.isEndOfWord = true; // Mark the end of the word
    }
    
    public boolean search(String word){
        return searchInNode(word, root, 0);
    }
    
    // Helper method to search with support for '.' wildcards
    private boolean searchInNode(String word, TrieNode node, int start){
        for (int i = start; i < word.length(); i++){
            char ch = word.charAt(i);
            if (ch == '.'){
                for (int j = 0; j < 26; j++){
                    if (node.children[j] != null && searchInNode(word, node.children[j], i+1)) return true;
                }
                return false;
            } else{
                int index = ch - 'a';
                if (node.children[index] == null) return false;
                node = node.children[index];
            }
        }
        return node.isEndOfWord;
    }
}
