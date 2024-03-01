/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<List<String>>();
        List<int[]> freqList = new ArrayList<int[]>();
        
        for (int stringIdx=0; stringIdx < strs.length; stringIdx++){
            
            // determine freq of current string
            int[] currentFreq = new int[26];
            for (int charIdx = 0; charIdx < strs[stringIdx].length(); charIdx++) {
                int idx = strs[stringIdx].charAt(charIdx) % 26;
                currentFreq[idx]++;
            }
            
            // compare freq to existing list
            boolean match = false;
            for (int sublistIdx=0; sublistIdx < ans.size(); sublistIdx++){
                int[] sublistFreq = freqList.get(sublistIdx);   
                if (Arrays.equals(currentFreq, sublistFreq)){
                    ans.get(sublistIdx).add(strs[stringIdx]);
                    match = true;
                    break;
                }
            }
            
            // create new sublist and add to answer
            if (!match){
                freqList.add(currentFreq);
                List<String> nextList = new ArrayList<String>();
                nextList.add(strs[stringIdx]);
                ans.add(nextList);
            }

        }
        
        return ans;
    }
}
