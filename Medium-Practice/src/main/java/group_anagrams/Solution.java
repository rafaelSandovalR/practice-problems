/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_anagrams;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    
    private List<List<String>> ans;
    
    public List<List<String>> groupAnagrams(String[] strs) {

       return new AbstractList<List<String>>() {
           
           // overrides abstract get
           public List<String> get(int index){
               if (ans == null) init();
               return ans.get(index);
           }
           
           // overrides abstract size
           public int size() {
               if (ans == null) init();
               return ans.size();
           }
           
           // initializes data
           private void init() {
               Map<String, List<String>> map = new HashMap<>();
               for (String s : strs){
                   
                   // determine frequency of characters in string
                   int[] freq = new int[26];
                   for (char c : s.toCharArray()){
                       freq[c - 'a']++;
                   }
                   
                   // build a key for the map
                   StringBuilder sb = new StringBuilder();
                   for (int i = 0; i < 26; i++){
                       if (freq[i] != 0){
                           
                           // create a string using each character followed by its frequency
                           sb.append('a' + i);
                           sb.append(freq[i]);
                       }
                   }
                   String key = sb.toString();
                   
                   // add string to hashmap, create new entry if key is absent
                   map.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
                   ans = new ArrayList<>(map.values());
               }
           }
       };
    }
}
