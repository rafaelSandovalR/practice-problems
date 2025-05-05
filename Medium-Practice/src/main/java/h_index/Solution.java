/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h_index;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int hIndex(int[] citations){
        int n = citations.length;
        int h = 0;
        Arrays.sort(citations);

        for (int i = 0; i < n; i++){
            int candidate = Math.min(n-i, citations[i]);
            h = Math.max(candidate, h);
        }       
        return h;
    }
}
