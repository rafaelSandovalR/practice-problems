/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word_break;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Rsand
 */
public class BFSSolution {
    public boolean wordBreak(String s, List<String> wordDict){
        var words = new HashSet<>(wordDict); // Used for efficient lookups
        Queue<Integer> queue = new LinkedList<>(); // Stores the starting indicies of possible word breaks
        boolean[] seen = new boolean[s.length() + 1]; // track visited idices to avoid cycles
        queue.add(0);
        
        while (!queue.isEmpty()){
            int start = queue.poll(); // Dequeue the starting index of the current substring
            
            // Iterate through possible ending indices of the current substring
            for (int end = start + 1; end <= s.length(); end++){
                if (seen[end]) continue; // Skip already visited index
                
                // Extract the substring from start to end
                if (words.contains(s.substring(start, end))){
                    if (end == s.length()) return true; // When end of 's' is reached with a valid word
                    queue.add(end); // If word exists in dictionary, add end index to queue
                    seen[end] = true; // Mark end index as visited
                }
            }
        }
        
        return false; // If no valid word break is found
    }
}
