/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            // sort the characters in each string
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            
            // if sorted string does not exist as a key, add new list to hashmap
            if (!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            
            // add str to hashmap using sorted string as key
            map.get(sortedStr).add(strs[i]);
        }
               
        
        return new ArrayList<>(map.values());
    }
}
