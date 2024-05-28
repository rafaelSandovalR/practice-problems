/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement_trie;

import java.util.HashMap;


/**
 *
 * @author Rsand
 */
public class Trie {
    Node root;
    
    public Trie(){
        root = new Node();
    }
    
    public void insert(String word){
        root.insert(word, 0);
    }
    
    public boolean search(String word){
        return root.search(word, 0);
    }
    
    public boolean startsWith(String prefix){
        return root.startsWith(prefix, 0);
    }
    
    // Inner class representing a node in the Trie
    private class Node{
        Node[] nodes; // Array of 26 child nodes, one for each lowercase letter
        boolean isWord; // End of word flag
        
        private Node(){
            nodes = new Node[26]; // Initialize child nodes to null
        }
        
        private void insert(String word, int idx){
            if (idx >= word.length()) return; // Base case: Reached the end of the word
            int i = word.charAt(idx) - 'a'; // Calculate the index for current char ('a' -> 0, 'b' -> 1, etc.)
            
            if (nodes[i] == null){
                nodes[i] = new Node(); // If child node for this char doesn't exist, create it
            }
            
            if (idx == word.length() - 1){
                nodes[i].isWord = true; // If this is the last char, make as end of word
            }
            nodes[i].insert(word, idx+1); // Recursive call using the next index
        }
        
        private boolean search(String word, int idx){
            if (idx >= word.length()) return false; // Base case
            Node node = nodes[word.charAt(idx) - 'a']; // Get child node for current char
            
            if (node == null) return false; // If child node doesn't exist, the word is not in the Trie
            if (idx == word.length() - 1 && node.isWord) return true; // If last char and node has flag, the word is in the Trie
            
            return node.search(word, idx+1); // Recursive call using the next index
        }
        
        private boolean startsWith(String prefix, int idx){
            if (idx >= prefix.length()) return false; // Base case: Reached the end of the prefix, 
            Node node = nodes[prefix.charAt(idx) - 'a']; // Get child node for current char
            
            if (node == null) return false; // If node doesn't exist, no word starts with this prefix
            if (idx == prefix.length() - 1) return true; // If last char, prefix is found
            
            return node.startsWith(prefix, idx + 1); // Recursive call using next index
        }
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
