/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combinations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k){
        var res = new ArrayList<List<Integer>>(); // Initialize the result list to store all combinations
        
        helper(n, k, res, new ArrayList<Integer>()); // Call the recursive helper function
        
        return res;
    }
    
    private void helper(int n, int k, ArrayList<List<Integer>> mainList, ArrayList<Integer> subList){
        
        if(k == 0){ // Base case: If k (elements remaining to choose) is 0, we have a complete combination
            mainList.add(List.copyOf(subList));
            return;
        }
        
        if (n < 1 || n < k) { // Pruning (early termination): If n (current number) is less than 1 or k, no valid combination exists
            return;
        }
        
        subList.add(n); // Include the current number 'n' in the subList (combination)
        helper(n-1, k-1, mainList,subList); // Recursively explore combinations including 'n'
        
        subList.remove(subList.size()-1); // Backtrack: Remove the last value added (n) to explore other possibilities
        
        helper(n-1, k, mainList,subList); // Recursively explore combinations excluding 'n'


        
    }
}
