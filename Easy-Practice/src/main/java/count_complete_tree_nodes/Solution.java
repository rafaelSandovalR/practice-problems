/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package count_complete_tree_nodes;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int countNodes(TreeNode root){
        
        int height = getHeight(root);
        
        int missingNodes = getMissing(root, height - 1);
        
        int allNodes = 0;
        for (int exp = 0; exp < height; exp++){
            allNodes += Math.pow(2, exp);
        }
        
        return allNodes - missingNodes;
    }
    
    private int getMissing(TreeNode root, int height){
        
        if (height == 1){
            return root.left == null ? 2 : root.right == null ? 1 : 0;
        }

        int missingRight = getMissing(root.right, height - 1);
        int missingLeft = missingRight > 0 ? getMissing(root.left, height - 1) : 0;
        
        return missingRight + missingLeft;
    }
    
    private int getHeight(TreeNode root){
        if (root == null) return 0;
        
        return 1 + getHeight(root.left);
    }
}
