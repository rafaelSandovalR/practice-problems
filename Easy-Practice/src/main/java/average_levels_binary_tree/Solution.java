/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package average_levels_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null) return result;
        
        queue.add(root);
        
        while ( !queue.isEmpty() ){
            int n = queue.size();
            double sum = 0.0;
            
            // for each item in the level calc sum and add their children to queue
            for (int i = 0; i < n; i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            result.add(sum / n);
        }
        return result;
    }
}
