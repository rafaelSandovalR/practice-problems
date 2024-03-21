/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_binary_tree_preorder_inorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;


/**
 *
 * @author Rsand
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        
        int root = preorder[0];
        int leftChild = inorder[0] == root ? null : preorder[1];
        int rightChild = inorder[inorder.length-1] == root ? null : preorder[2];
        HashMap<Integer, Integer> inOrderIdxs = new HashMap<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        
        // Map values to their indices
        for (int i = 0; i < inorder.length; i++){
            inOrderIdxs.put(inorder[i], i);
        }
        
        for (int i = preorder.length-1; i >= 0; i--){
            int nodeVal = preorder[i];
            TreeNode nextNode = new TreeNode(nodeVal);
            
            if (!queue.isEmpty()){
                int currentNodeIdx = inOrderIdxs.get(nodeVal);
                int nextQueueIdx = inOrderIdxs.get(queue.peek().val);
                
                // If index for next in queue is one more than index of current
                // then next in queue is the right child of current node
                if (nextQueueIdx == currentNodeIdx + 1){
                    nextNode.right = queue.pop();
                }
                // recheck next in queue
                nextQueueIdx = inOrderIdxs.get(queue.peek().val);
                // If it is one less, it is the left child
                if (nextQueueIdx == currentNodeIdx - 1) {
                    nextNode.left = queue.pop(); 
                }
            }
            
            queue.add(nextNode);

        }

        
        return null;
    }
    

    
}


