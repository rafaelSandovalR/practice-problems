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
        // Start with the root of the tree
        Node node = root;
        
        // Iterate through each level of the tree
        while (node != null){
            // Create a dummy node to serve as the head of the next level
            Node dummy = new Node();
            // Use a 'needle' node to traverse and connect nodes at the next level
            for (Node needle = dummy; node != null; node = node.next){
                // If a left child exists, connect it to the 'needle' and move the 'needle'
                if (node.left != null){
                    needle.next = node.left;
                    needle = needle.next; 
                }
                // If a right child exists, connect it to the 'needle' and move the 'needle'
                if (node.right != null){
                    needle.next = node.right;
                    needle = needle.next;
                }
            }
            // Move to the next level by starting from the dummy node's next
            node = dummy.next;
        }
        
        // Return the original root of the tree
        return root;
    }
}
