/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_window_substring;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String minWindow(String s, String t){
        String minSubString = "";
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        
        int[] finalCount = new int[128];
        int[] count = new int[128];
        int[] firstOccur = new int[128];
        
        // Fill array with count of each character in 't'
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            finalCount[c]++;
        }
        
        for (int i = 0; i < s.length(); i++){
            
        }
        
        return minSubString;
    }
}
