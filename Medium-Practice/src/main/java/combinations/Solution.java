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
        var res = new ArrayList<List<Integer>>();
        
        helper(n, k, res, new ArrayList<Integer>());
        
        return res;
    }
    
    private void helper(int n, int k, ArrayList<List<Integer>> mainList, ArrayList<Integer> subList){
        
        if(k == 0){
            mainList.add(List.copyOf(subList));
            return;
        }
        
        if (n < 1 || n < k) {
            return;
        }
        
        subList.add(n);
        helper(n-1, k-1, mainList,subList);
        
        subList.remove(subList.size()-1); // Backtrack: remove the last value added
        
        helper(n-1, k, mainList,subList);


        
    }
}
