/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_anagrams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        /*
            - Create Output list
            - Enter first item into first list
            - While STRS has more items
                - While List has more lists
                    - Compare item to first item of first list
                    - If anagram, add to list and break
                    - If end of list, create new list, add item to it and break;
            = Return List
        */
      
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> firstList = new ArrayList<String>();

        List<int[]> freqList = new ArrayList<int[]>();
        int[] freq = new int[26];
        
        for (int i = 0; i < strs[0].length(); i++) {
            int idx = strs[0].charAt(i) % 26;
            freq[idx]++;
        }

        freqList.add(freq);
        firstList.add(strs[0]);
        ans.add(firstList);
        
        for (int i=1; i < strs.length; i++){
            // determine freq of current string
            int[] currentFreq = new int[26];
            for (int j = 0; i < strs[i].length(); j++) {
                int idx = strs[i].charAt(j) % 26;
                currentFreq[idx]++;
            }
            // compare freq to existing list
            for (int k=0; k < ans.size(); k++){
                int[] listFreq = freqList.get(k);
                
            }
        }
        
        return ans;
    }
}
