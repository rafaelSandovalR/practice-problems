/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copy_list_with_random_pointer;

/**
 *
 * @author Rsand
 */
public class interleavingSolution {
    public Node copyRandomList(Node head){
        if (head == null) return null;
        
        Node temp = head;
        
        // Step 1: Create copy of each node and insert after the original (interleaving)
        while (temp != null){
            Node copyNode = new Node(temp.val);     // Create copy node with original value
            copyNode.next = temp.next;  // Link copy node to original node's next
            temp.next = copyNode;   // Insert the copy node after original
            temp = temp.next.next;  // Move to the next original node
        }
        
        temp = head; // Go back to beginning
        
        // Step 2: Assign random pointers for the copied nodes
        while (temp != null){
            // If original random is not null, assign copy of random to copy node
            if (temp.random != null) temp.next.random = temp.random.next;
            temp = temp.next.next; // Move to the next original node
        }
        
        // Step 3: Separate the original and copied list
        Node dummy = new Node(-1); // Create dummy node to help with list separation
        Node res = dummy;   // Initialize a pointer to the dummy
        temp = head; // Go back to beginning
        
        while (temp != null){
            res.next = temp.next;   // Link the result list to the copy node
            temp.next = temp.next.next; // Restore the original list by linking to the next original node
            
            res = res.next;     // Move result pointer to the next node
            temp = temp.next;   // Move temp pointer to next original node
        }
        
        return dummy.next; // Return the head of the copied list (after the dummy node)
    }
}
