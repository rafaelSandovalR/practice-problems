/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package is_subsequence;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public boolean isSubsequence(String s, String t){
        char[] sub = s.toCharArray(), main = t.toCharArray();
        int sPtr = 0, tPtr = 0, sLen = s.length(), tLen = t.length();
        
        while (sPtr < sLen && tPtr < tLen){
            if (main[tPtr++] == sub[sPtr]) sPtr++;
        }
        
        return sPtr == sLen;
    }
}
