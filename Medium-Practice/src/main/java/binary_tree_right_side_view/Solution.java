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
        TreeNode start = root;
        List<Integer> rightSideView = new ArrayList<Integer>();
        
        while (start != null) {
            rightSideView.add(start.val);
            start = start.right == null ? start.left : start.right;
        }
        
        if (root.left != null) {
            start = root.left;
            int listSizeSoFar = rightSideView.size();
            int leftBranchCount = 0;
            while (start != null) {
                leftBranchCount++;
                if (leftBranchCount > listSizeSoFar) {
                    rightSideView.add(start.val);
                }
                start = start.right == null ? start.left : start.right;
            }
        }

        return rightSideView;
    }
}
