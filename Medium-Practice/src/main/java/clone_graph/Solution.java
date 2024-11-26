/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clone_graph;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Rsand
 */
public class Solution {
    public Node cloneGraph(Node node){
        if (node == null) return null; // Base case: empty input
        
        Deque<Node> queue = new ArrayDeque<>(); // Queue of originals that need to be cloned fully
        Map<Node, Node> map = new HashMap<>(); // Map clones to originals
        
        map.put(node, new Node(node.val));
        queue.offer(node);
        
        
        while(!queue.isEmpty()){

            Node original = queue.poll();
            Node clone = map.get(original); // Get clone of original from map
            
            for (Node neighbor : original.neighbors){
                
                if (!map.containsKey(neighbor)){
                    Node neighborClone = new Node(neighbor.val);  // Else create clone
                    map.put(neighbor, neighborClone);       // Map to original neighbor
                    queue.offer(neighbor);                  // Add original neighbor to queue
                }
                
                clone.neighbors.add(map.get(neighbor)); // Add the clone to this clone's neighbors

            }

        }
        
        return map.get(node);
    }
}
