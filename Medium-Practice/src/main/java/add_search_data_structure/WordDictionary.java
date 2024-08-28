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
            if (idx >= word.length()) return;
            int i = word.charAt(idx) - 'a';
            if (children[i] == null) children[i] = new Node();
            if (idx == word.length() - 1) children[i].isEnd = true;
            children[i].insert(word, idx+1);
        }
        
        private boolean search(String word, int idx){
            if (idx >= word.length()) return false;
            
            char character = word.charAt(idx);
            Node node;
            
            if (character == '.'){
                for (int i = 0; i < 26; i++){
                    node = children[i];
                    if (node != null){
                        if (idx == word.length() - 1 && node.isEnd) return true;
                        if(node.search(word, idx+1)) return true;
                    }
                }
                return false;
            }
            
            node = children[character - 'a'];
            if (node == null) return false;
            if (idx == word.length() - 1 && node.isEnd) return true;
            
            return node.search(word, idx+1);
            
        }
    }
}
