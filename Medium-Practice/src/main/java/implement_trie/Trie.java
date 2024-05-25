/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement_trie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Trie {
    node root = new node();
    
    public Trie(){
        
    }
    
    public void insert(String word){
        
    }
    
    public boolean search(String word){
        
    }
    
    public boolean startsWith(String prefix){
        
    }
    
    private class node{
        boolean[] contains;
        List<node> children;
        
        public node(){
            contains = new boolean[27]; // index 15 stands for * and the rest are lower case letters % 27
            children = new ArrayList<>();
        }
        
        public void addChild(node child){
            children.add(child);
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
