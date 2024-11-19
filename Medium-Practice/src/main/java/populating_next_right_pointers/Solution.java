/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package populating_next_right_pointers;

/**
 *
 * @author Rsand
 */
public class Solution {
    public Node connect(Node root){

        prepNext(root);
        traverse(root);
        return root;
    }
    
    // Method to set all 'next' pointers to their parent node
    private void prepNext(Node root){
        if (root == null) return;
        if (root.left != null) root.left.next = root;
        if (root.right != null) root.right.next = root;
        
        prepNext(root.left);
        prepNext(root.right);
    }
    
    private void traverse(Node root){
        // Variables to simplify following code
        Node left = root.left;
        Node right = root.right;
        
        // Case 1: Root has two children
        if (left != null && right != null){ 
            left.next = right;
            right.next = getRight(right.next, right);
        } 
        // Case 2: Root only has left child
        else if (left != null){ 
            left.next = getRight(left.next, left);
        } 
        // Case 3: Root only has right child
        else if (right != null){ 
            right.next = getRight(right.next, right);
        } 
        // Case 4: Root has no children
        else {
            return; 
        }
        
        // Traverse left and right subtrees
        if (left != null) traverse(left);
        if (right != null) traverse(right);
    }
    
    private Node getRight(Node next, Node curr){
        
        
        if (next.left == curr && next.right != null) return getRight(next.right, next);
       
        
        if (next.right == curr || next.right == null){
            if (next.next == null) return null;
            return getRight(next.next, next);
        }
        
        
        if (next.left != null) return next.left;
        
        if (next.right != null) return next.right;
        
        return null;
    }
}
