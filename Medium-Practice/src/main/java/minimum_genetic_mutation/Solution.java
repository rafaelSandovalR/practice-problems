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
        char[] end = endGene.toCharArray();
        char[][] bankGraph = new char[bank.length][];
        boolean containsEnd = false; // Flag to check if end is in bank
        
        // Convert and add each bank record to 2d char array
        int idx = 0;
        for (String gene : bank){
            bankGraph[idx++] = gene.toCharArray();
            if (endGene.equals(gene)) containsEnd = true; // Raise flag
        }
        
        if (!containsEnd) return -1; // If not found, it can't be solved
        
        // Arrays to keep track of differences of between each bank record and start or end genes
        int[] startDiffCount = new int[bank.length];
        int[] endDiffCount = new int[bank.length];
        
        // Populate difference count arrays
        for (int letter = 0; letter < 8; letter++){
            for (int bankRecord = 0; bankRecord < bank.length; bankRecord++){
                char letterScanned = bankGraph[bankRecord][letter];
                if (letterScanned != start[letter]) startDiffCount[letter]++;
                if (letterScanned != end[letter]) endDiffCount[letter]++;
                
                
            }
        }

    }
}
