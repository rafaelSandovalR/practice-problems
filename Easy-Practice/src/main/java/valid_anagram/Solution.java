/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_anagram;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isAnagram(String s, String t){
        
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        
        for (int i=0; i < s.length(); i++){
            int idx = s.charAt(i) % 26;
            freq[idx]++;
        }
        
        for (int i=0; i < t.length(); i++){
            int idx = t.charAt(i) % 26;
            if (freq[idx] == 0) return false;
            freq[idx]--;
        }
        
        return true;
    }
}
