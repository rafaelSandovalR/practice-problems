/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package substring_with_concat;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Test {

        HashMap<String, Integer> qtyMap = new HashMap<String, Integer>();
        HashMap<String, Integer> foundMap = new HashMap<String, Integer>();

        public List<Integer> findSubstring(String s, String[] words) {
            var res = new LinkedList<Integer>(); // Store the starting indices of valid substrings

            int i = 0, j = 0, n = words.length; // i: start of window, j: word counter, n: total words
            int wordSize = words[0].length(); // Length of each word
            int totalConcatLength = wordSize * n;

            // Count the occurences of each word in 'words' array
            for (int k = 0; k < words.length; k++) {
                qtyMap.merge(words[k], 1, Integer::sum);
            }

            foundMap = new HashMap<>(qtyMap); // Initialize foundMap with expected word counts

            loop:  // Label for the outer loop
            while (i <= s.length() - totalConcatLength) {
                if (j != 0) {
                    foundMap = new HashMap<>(qtyMap); // Reset foundMap for a new substring check
                }
                for (j = 0; j < n; j++) {
                    if (!popWord(s.substring(i + (wordSize * j), i + wordSize * (j + 1)))) {
                        i++; // Move the window if a word is missing or overcounted
                        continue loop; // Continue to the next iteration of the outer loop
                    }
                }
                res.add(i); // All words found in the current window, add the starting index
                i++; // Move the window to the next position
            }
            return res;

        }

        // Helper function to check and update the count of a word in the current window
        private boolean popWord(String s) {
            Integer val = foundMap.get(s); // Get the current count of the word
            if (val != null && val != 0) {
                foundMap.put(s, --val); // Decrement the count and update the map
                return true; // Word found and decement successful
            }
            return false; // Word not found or already overcounted
        }
}
