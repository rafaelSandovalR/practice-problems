/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package substring_with_concat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<Integer> findSubstring(String s, String[] words){
        List<Integer> result = new ArrayList<>();
        int stringSize = s.length();
        int wordsQty = words.length;
        int wordLength = words[0].length();

        // Early return if there are no words or the string is too short
        if (wordsQty == 0 || stringSize < wordsQty * wordLength) {
            return result;
        }

        Map<String, Integer> qtyMap = new HashMap<>();
        for (String word : words) {
            qtyMap.put(word, qtyMap.getOrDefault(word, 0) + 1); // Initialize or increment
        }

        // Main sliding window loop
        for (int i = 0; i < wordLength; i++) {

            Map<String, Integer> foundMap = new HashMap<>(); // Count of found words in current window
            int count = 0; // Count of valid words found so far
            int start = i; // Start index of the sliding window

            // Iterate over possible starting positions within each partition
            for (int j = i; j <= stringSize - wordLength; j += wordLength) {
                String currentWord = s.substring(j, j + wordLength);

                // Check if current word is valid and increment count if within limit
                if (qtyMap.containsKey(currentWord)) {

                    // Valid word: Update count and check if we have too many occurences
                    foundMap.merge(currentWord, 1, Integer::sum);
                    if (foundMap.get(currentWord) <= qtyMap.get(currentWord)) {
                        count++;
                    } else {

                        // We have too many of this word, so shrink the window until valid
                        while (foundMap.get(currentWord) > qtyMap.get(currentWord)) {
                            String leftMostWord = s.substring(start, start + wordLength);
                            foundMap.merge(leftMostWord, -1, Integer::sum);
                            if (foundMap.get(leftMostWord) < qtyMap.get(leftMostWord)) {
                                count--;
                            }
                            start += wordLength;
                        }
                    }
                } else {
                    // Invalid word: Reset window
                    foundMap.clear();
                    count = 0;
                    start = j + wordLength;
                    continue;
                }

                // Check if current window has all the words
                if (count == wordsQty) {
                    result.add(start);
                    String leftMostWord = s.substring(start, start + wordLength);
                    foundMap.merge(leftMostWord, -1, Integer::sum);
                    count--;
                    start += wordLength;
                }
            }
        }
        return result;
    }

}
