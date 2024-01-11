/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package max_difference_node_ancestor;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxAncestorDiff(TreeNode root){
        int maxVal = 0;
        TreeNode a, b;
        
        //Idea: Recursive function
        //Go Farthest Left and Go Farther Right
        
        /*
        
        1. Set a to root;
        2. While a's left node is not null
            a. Set b to a's left node
        3. Set maxVal to a-b
        4. While a's right node is not null
            a. Set b to a's right node
        3. If a-b is more than maxVal, set maxVal to it.
        
        */
        return maxVal;
    }
}
