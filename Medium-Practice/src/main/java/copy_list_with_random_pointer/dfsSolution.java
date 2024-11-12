/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copy_list_with_random_pointer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class dfsSolution {
    public Node copyRandomList(Node head){
        Map<Node, Node> map = new HashMap<>();  // Map to link original to copy nodes
        dfs(head, map); // Start dfs from the head
        return map.get(head); // Return the copy of the head
    }
    
    private Node dfs(Node root, Map<Node, Node> map){
        if (root == null) return null; // Base case: next node is null or random is null
        
        // Base case: copy node was already created, simply return that node
        if (map.containsKey(root)) return map.get(root);
        
        Node copy = new Node(root.val);     // Create copy node with original value
        map.put(root, copy);            // Map copy to its original
        copy.next = dfs(root.next, map);    // Recursively set copy node's next node
        copy.random = dfs(root.random, map);    // Recusively set copy node's random node
        
        return copy; // Return the copy node
    }
}
