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
        return 0;
    }
    
    public int findMaxDiff(TreeNode ancestor, int prevMax, int prevMin){
        
        //max diff values from left and right branches
        int maxLeft=0, maxRight=0;
        
        //max between prevMax and current node's value  
        int newMax, newMin;

        int currentDiff = prevMax - prevMin; //defaults to previous max difference for null node
        
        
        if(ancestor.left != null){
            //gets min/max between prev values and left node
            newMax = Math.max(prevMax, ancestor.left.val);
            newMin = Math.min(prevMin, ancestor.left.val);
            currentDiff = newMax - newMin;
            
            //recursive call with new min/max
            maxLeft = findMaxDiff(ancestor.left, newMax, newMin);
        }
        
        if(ancestor.right != null){
            //gets min/max between prev values and left node
            newMax = Math.max(prevMax, ancestor.right.val);
            newMin = Math.min(prevMin, ancestor.right.val);
            currentDiff = newMax - newMin;

            //recursive call with new min/max
            maxLeft = findMaxDiff(ancestor.right, newMax, newMin);
        }
        
        return 0;
    }
    
}
