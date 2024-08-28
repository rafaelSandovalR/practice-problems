/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_search_data_structure;

/**
 *
 * @author Rsand
 */
public class WordDictionary {
    Node root;
    
    public WordDictionary(){
        root = new Node();
    }
    
    public void addWord(String word){
        root.insert(word, 0);
    }
    
    public boolean search(String word){
        return root.search(word, 0);
    }
    
    class Node {
        Node[] children;
        boolean isEnd;
        
        Node(){
            children = new Node[26];
        }
        
        private void insert(String word, int idx){
            if (idx >= word.length()) return; // Reached the end of input word
            int i = word.charAt(idx) - 'a'; // Convert character value into valid index
            
            // Create child node (representing current char) for current node if doesn't exist yet
            if (children[i] == null) children[i] = new Node(); 
            
            if (idx == word.length() - 1) children[i].isEnd = true; // If last index, then mark as end of word
            children[i].insert(word, idx+1); // Recursive call while incrementing index
        }
        
        private boolean search(String word, int idx){
            if (idx >= word.length()) return false; // Reached end of input word
            
            char character = word.charAt(idx); // Character at current index
            Node node;
            
            // '.' handling
            if (character == '.'){
                
                // Go through each possible child letter that '.' can represent
                for (int i = 0; i < 26; i++){
                    node = children[i]; // Set next possible child as current node
                    
                    // If child with that letter exists
                    if (node != null){
                        // If end of the input word and current node is marked as end of a word
                        if (idx == word.length() - 1 && node.isEnd) return true;
                        if(node.search(word, idx+1)) return true; // Recursion
                    }
                }
                return false; // Character was '.' and there were no children for it to represent
            }
            
            node = children[character - 'a']; // Set child based on current letter
            if (node == null) return false; // No child with that letter
            if (idx == word.length() - 1 && node.isEnd) return true; // End of input word and current node marked as end
            
            return node.search(word, idx+1); // Recursion
            
        }
    }
}
