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

        traverse(root);
        return root;
    }
    
    private void traverse(Node root){
        Node left = root.left;
        Node right = root.right;
        
        if (left != null) root.left.next = root;
        if (right != null) root.right.next = root;
        
        if (left != null && right != null){ // Case 1: Root has two children
            left.next = right;
            right.next = getRight(right.next, right);
        } else if (left != null){ // Case 2: Root only has left child
            left.next = getRight(left.next, left);
        } else if (right != null){ // Case 3: Root only has right child
            right.next = getRight(right.next, right);
        } else {
            return; // Case 4: Root has no children
        }
        
        if (left != null) traverse(left);
        if (right != null) traverse(right);
        
    }
    
    private Node getRight(Node next, Node curr){
        
        if (next.right == curr || next.right == null){
            if (next.next == null) return null;
            return getRight(next.next, next);
        }
        
        if (next.left != null) return next.left;
        
        if (next.right != null) return next.right;
        
        return null;
    }
}
