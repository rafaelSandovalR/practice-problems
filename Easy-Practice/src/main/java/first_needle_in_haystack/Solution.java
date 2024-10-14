/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first_needle_in_haystack;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int strStr(String haystack, String needle){
        
        int n = needle.length();
        
        for (int i = 0; i + n <= haystack.length(); i++){
            if (haystack.substring(i,i+n).equals(needle)) return i;
        }
        
        return -1;
    }
}
