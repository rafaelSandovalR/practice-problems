/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        // Create main list to hold sublists
        var levelOrderTraversal = new ArrayList<List<Integer>>();
        if (root == null) return levelOrderTraversal;
        
        // Create queue to hold all nodes on each level
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        // While queue is not empty
        while (!q.isEmpty()){
            // Create sublist for current level
            var subList = new ArrayList<Integer>();
            
            int n = q.size();
            // Loop till size of queue to;
            for (int i = 0; i < n; i++){
                // Poll queue
                TreeNode node = q.poll();
                // add value to current sublist
                subList.add(node.val);
                // add left child to queue
                if (node.left != null) q.add(node.left);
                // add right child to queue
                if (node.right != null) q.add(node.right);
            }
            // Add sublist to main list
            levelOrderTraversal.add(subList);
        }
        // Return main list
        return levelOrderTraversal;
    }
}
