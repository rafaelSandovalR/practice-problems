/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_tree_right_side_view;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root){

        List<Integer> rightSideView = new ArrayList<Integer>();
        if (root == null) return rightSideView;
        
        int maxDepth = addNode(rightSideView, root, 0,0);

        return rightSideView;
    }
    
    private int addNode(List<Integer> rightSideView, TreeNode root, int max, int current){
        
        if (root == null) return max;
        
        // Increment current depth
        current++;
        
        // If current depth is more than max, add value to list
        if (current > max){
            rightSideView.add(root.val);
            max = current;
        }
        
        // Recursively get the max of the right side
        max = addNode(rightSideView, root.right, max, current);
        // Using the max of the right side, traverse through left side
        int leftSideDepth = addNode(rightSideView, root.left, max, current);
        
        // Return the latest max depth
        return Math.max(max, leftSideDepth);
    }
}
