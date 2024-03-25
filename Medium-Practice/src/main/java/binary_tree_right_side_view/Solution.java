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
        
        addToList(rightSideView, root, 0);
        
        return rightSideView;
    }
    
    private void addToList(List<Integer> rightSideView, TreeNode root, int max){
        
        if (root == null) return;
                
        // If current depth is more than max, add value to list
        if (max == rightSideView.size()) {
            rightSideView.add(root.val);
        }
        
        // Traverse the right side first to get the right side view
        addToList(rightSideView, root.right, max+1);
        addToList(rightSideView, root.left, max+1);
        
    }
}
