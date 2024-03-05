/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_anagrams;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        long startTime = System.nanoTime();
        
        List<List<String>> ans = sol.groupAnagrams(strs);
        
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Execution time in nanoseconds: " + elapsedTime);
        
        
        /*
        RUNTIME + MEMORY:
            2-29-24 :   797000 nanoseconds
                        546 ms in Leetcode
        
            3-2-24  :   277600 nanoseconds  0.568 s
                        6 ms in Leetcode
        
            3-2-24  :   343600 nanoseconds  0.557 s
                        0 ms in Leetcode    49.08 MB
        */
        
    }

    
}
