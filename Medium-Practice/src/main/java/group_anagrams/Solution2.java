/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_anagrams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs){
        
        Map<String, List<String>> map = new HashMap<>(); // Map of sorted string and the group associated
        
        for (String word : strs){
            char[] ch = word.toCharArray(); // Convert to char array for sorting
            Arrays.sort(ch);
            String anagramKey = new String(ch); // Sorted string becomes key for each group
            
            if (!map.containsKey(anagramKey)){
                map.put(anagramKey, new ArrayList<>()); // Create new mapping if doesn't exist
            }
            
            map.get(anagramKey).add(word); // Add string in proper group
        }
        
        return new ArrayList<>(map.values()); // Return list of groups
    }
}
