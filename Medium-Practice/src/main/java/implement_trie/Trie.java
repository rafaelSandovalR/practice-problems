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
        root = new Node(' ');
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
    
    private class Node{
        char letter;
        boolean isWord;
        HashMap<Character, Node> childrenMap;
        
        public Node(char letter){
            this.letter = letter;
            childrenMap = new HashMap<>();
        }
        
        public void addChild(Node child){
            childrenMap.put(child.letter, child);
        }
        
        private void insert(String word, int idx){
            if (idx >= word.length()) return;
            char currentChar = word.charAt(idx);
            Node currentNode = childrenMap.get(currentChar);
            if (currentNode == null){
                currentNode = new Node(currentChar);
                childrenMap.put(currentChar, currentNode);
            }
            if (idx == word.length() - 1) currentNode.isWord = true;
            currentNode.insert(word, idx+1);
        }
        
        private boolean search(String word, int idx){
            if (idx >= word.length()) return false;
            Node currentNode = childrenMap.get(word.charAt(idx));
            if (currentNode == null) return false;
            if (idx == word.length() - 1 && currentNode.isWord) return true;
            return currentNode.search(word, idx+1);
        }
        
        private boolean startsWith(String prefix, int idx){
            if (idx >= prefix.length()) return false;
            Node currentNode = childrenMap.get(prefix.charAt(idx));
            if (currentNode == null) return false;
            if (idx == prefix.length() - 1) return true;
            
            return currentNode.startsWith(prefix, idx + 1);
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
