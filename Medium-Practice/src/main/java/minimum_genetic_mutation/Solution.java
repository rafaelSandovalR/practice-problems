/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_genetic_mutation;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int minMutation(String startGene, String endGene, String[] bank){
        
        
        // Convert all strings to char arrays
        char[] start = startGene.toCharArray();
        final char[] end = endGene.toCharArray();
        final char[][] bankGraph = new char[bank.length][];
        int[] count = new int[bank.length];
        boolean containsEnd = false; // Flag to check if end is in bank
        
        // Convert and add each bank record to 2d char array
        int idx = 0;
        for (String gene : bank){
            bankGraph[idx++] = gene.toCharArray();
            if (endGene.equals(gene)) containsEnd = true; // Raise flag
        }
        
        if (!containsEnd) return -1; // If not found, it can't be solved
        
        // Arrays to keep track of differences of between each bank record and start/end genes
        int[] startDiffCount = new int[bank.length];
        final int[] endDiffCount = new int[bank.length]; // May not need this ***
        
        // Populate difference count arrays
        for (int letter = 0; letter < 8; letter++){
            for (int bankRecord = 0; bankRecord < bank.length; bankRecord++){
                char letterScanned = bankGraph[bankRecord][letter];
                if (letterScanned != start[letter]) startDiffCount[letter]++;
                if (letterScanned != end[letter]) endDiffCount[letter]++;

            }
        }
        int[] queue = new int[bank.length];
        int write = 0;
        int read = 0;
        
        // Find the candidate genes to add to queue
        for (int i = 0; i < startDiffCount.length; i++){
            if (startDiffCount[i] == 1 && count[i] == 0){
                queue[write++] = i;
            }
        }
        
        int[] prev = new int[bank.length];
                
        while (read != write){
            int geneIdx = queue[read]; 
            char[] gene = bankGraph[geneIdx];
            count[geneIdx] = prev[read] + 1;
            
            if (new String(gene).equals(endGene)) return count[geneIdx];
            
            int[] diffCount = scanDifferences(bankGraph, gene);
            
            for (int i = 0; i < diffCount.length; i++){
                
                if (diffCount[i] == 0){
                    boolean inQueue = false;
                    for (int j = read; j < write; j++){
                        if (queue[j] == i) inQueue = true;
                    }
                    
                    if (!inQueue){
                        queue[write++] = i;
                    } 
                }
            }
            
            
        }
        
        return -1;
    }
    
    private int[] scanDifferences(char[][] bank, char[] gene){
        
        int[] diffCount = new int[bank.length];
        for (int letter = 0; letter < 8; letter++) {
            for (int bankRecord = 0; bankRecord < bank.length; bankRecord++) {
                char letterScanned = bank[bankRecord][letter];
                if (letterScanned != gene[letter]) {
                    diffCount[letter]++;
                }
            }
        }
        
        return diffCount;
    }
    
}
