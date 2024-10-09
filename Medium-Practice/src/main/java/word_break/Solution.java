/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_break;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict){
        
        TrieNode root = new TrieNode();
        
        // Build Trie with each word
        for (String word : wordDict){
            TrieNode curr = root;
            for (char c : word.toCharArray()){
                if (!curr.children.containsKey(c)){
                    curr.children.put(c, new TrieNode());
                }
                curr = curr.children.get(c);
            }
            
            curr.isWord = true; // Mark end of word in the Trie
        }
        
        // Dynamic programming with Trie
        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++){
            if (i == 0 || dp[i - 1]){ // Can we start a new word here?
                TrieNode curr = root;
                for (int j = i; j < s.length(); j++){
                    char c = s.charAt(j);
                    
                    if (!curr.children.containsKey(c)) break; // No words start with this prefix
                    
                    curr = curr.children.get(c);
                    if (curr.isWord) dp[j] = true; // Found a word ending at index j
                }
            }
        }
        
        return dp[s.length() - 1];
    }
}

class TrieNode{
    boolean isWord;
    Map<Character, TrieNode> children;
    
    TrieNode(){
        this.children = new HashMap<>();
    }
}
