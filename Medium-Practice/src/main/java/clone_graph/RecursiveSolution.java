/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clone_graph;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class RecursiveSolution {
    public Node cloneGraph(Node node){
        if (node == null) return null; // Base case: Empty input
        
        Map<Node, Node> map = new HashMap<>(); // Map originals to clones
        deepCopy(node, map); // Recursive call to create deep copies of each original node
        
        return map.get(node); // Return copy of original reference node
    }
    
    public void deepCopy(Node original, Map<Node, Node> map){
        Node clone = new Node(original.val); // Create shallow copy of original
        map.put(original, clone);       // Map original to clone
        
        // Complete deep copy
        for (Node neighbor : original.neighbors){
            
            // If neighbor has not been cloned & mapped yet
            if (!map.containsKey(neighbor)){
                deepCopy(neighbor, map); // Recursively perform deep copy
            }
            
            // Add the cloned neighbor to this clone's neighbor list
            clone.neighbors.add(map.get(neighbor));
        }
    }
}
