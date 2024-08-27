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
        int n = bank.length + 1; // number of genes including startGene
         
        char[][] bankGraph = new char[n][];
        bankGraph[0] = startGene.toCharArray(); // Add start gene to bank
        int[] mutationCount = new int[n];
        boolean containsEnd = false; // Flag to check if end is in bank
        
        // Convert and add each bank record to 2d char array
        int idx = 1;
        for (String gene : bank){
            bankGraph[idx++] = gene.toCharArray();
            if (endGene.equals(gene)) containsEnd = true; // Raise flag
        }
        
        if (!containsEnd) return -1; // If not found, it can't be solved
                
        int[] queue = new int[n];
        
        queue[0] = 0;
        int read = 0;
        int write = 1;
        
        
        int[] prev = new int[n]; // Holds bank index of previous gene from current
        
        while (read != write){
            int geneIdx = queue[read];  // Current Gene Index
            char[] gene = bankGraph[geneIdx]; // Current Gene
            mutationCount[geneIdx] = prev[read] + 1; // Increment mutation count
            
            // If endGene is found
            if (new String(gene).equals(endGene)) return mutationCount[geneIdx];
            
            // Generate array indicating how many mutations away current gene is from each bank gene
            int[] diffCount = scanDifferences(bankGraph, gene);
            
            // Loop to enqueue valid indices
            for (int i = 0; i < n; i++){    
                if (diffCount[i] == 0 && !inQueue(queue, i, read, write)){
                    queue[write++] = i;
                    prev[read] = geneIdx;
                }
            }       
        }
        
        return -1;
    }
    
    private boolean inQueue(int[] queue, int value, int read, int write){
        boolean result = false;
        for (int j = read; j < write; j++) {
            if (queue[j] == value) {
                result = true;
            }
        }
        return result;
    } 
    
    private int[] scanDifferences(char[][] bank, char[] gene){
        int n = bank.length;
        int[] diffCount = new int[n];
        for (int letter = 0; letter < 8; letter++) {
            for (int bankRecord = 0; bankRecord < n; bankRecord++) {
                char letterScanned = bank[bankRecord][letter];
                if (letterScanned != gene[letter]) {
                    diffCount[bankRecord]++;
                }
            }
        }
        return diffCount;
    }
    
}
