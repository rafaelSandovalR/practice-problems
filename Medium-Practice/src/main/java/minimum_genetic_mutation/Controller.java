/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_genetic_mutation;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        
        int minGeneticMutations = sol.minMutation(startGene, endGene, bank);
    }
}
