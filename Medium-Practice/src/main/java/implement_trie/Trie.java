/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement_trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        char[] charArray = word.toCharArray();
        Node currentNode = root;

        for (int i = 0; i < charArray.length; i++){
            char charKey = charArray[i];
            if (currentNode.childrenMap.containsKey(charKey)){
                currentNode = currentNode.childrenMap.get(charKey);
            } else{
                Node newChild = new Node(charKey);
                currentNode.addChild(newChild);
                currentNode = newChild;
            }
        }
        currentNode.isWord = true;
    }
    
    public boolean search(String word){
        char[] charArray = word.toCharArray();
        Node currentNode = root;
        
        for(int i = 0; i < charArray.length; i++){
            char charKey = charArray[i];
            if (!currentNode.childrenMap.containsKey(charKey)){
                return false;
            }
            currentNode = currentNode.childrenMap.get(charKey);
        }
        
        return currentNode.isWord;
    }
    
    public boolean startsWith(String prefix){
        char[] charArray = prefix.toCharArray();
        Node currentNode = root;

        for (int i = 0; i < charArray.length; i++) {
            char charKey = charArray[i];
            if (!currentNode.childrenMap.containsKey(charKey)) {
                return false;
            }
            currentNode = currentNode.childrenMap.get(charKey);
        }
        return true;
    }
    
    private class Node{
        char letter;
        boolean isWord;
        HashMap<Character, Node> childrenMap;
        
        public Node(char letter){
            this.isWord = false;
            this.letter = letter;
            this.childrenMap = new HashMap<>();
        }
        
        public void addChild(Node child){
            childrenMap.put(child.letter, child);
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
