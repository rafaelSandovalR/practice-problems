/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h_index;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int hIndex(int[] citations){
        
        int numberOfPapers = citations.length;
        if (numberOfPapers == 0) return 0;
        
        int[] countsPerCitationLevel = new int[numberOfPapers + 1];
        
        // Populate the frequency array.
        for (int count : citations){
            int effectiveCount = Math.min(count, numberOfPapers);
            countsPerCitationLevel[effectiveCount]++;
        }
        
        int papersWithAtLeastHCitations = countsPerCitationLevel[numberOfPapers];
        
        // Iterate downwards from the maximum possible h-index (numberOfPapers).
        // 'h' represents the current h-index candidate we are checking.
        for (int h = numberOfPapers; h > 0; h--){
            if (papersWithAtLeastHCitations >= h) return h;
            
            papersWithAtLeastHCitations += countsPerCitationLevel[h-1];
        }
        
        return 0;
    }
}
