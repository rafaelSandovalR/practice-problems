/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluate_division;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rsand
 */
public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries){
        
        int i = 0; // Pointer to traverse values
        // Create a map to store graph nodes (variables)
        Map<String, Node> existing = new HashMap<>();
        
        // Build the graph from the given equations and values
        for (List<String> equation : equations){
            // Equation represents A / B = value
            String A = equation.get(0);
            String B = equation.get(1);
            
            // Get or create nodes for A and B
            Node nodeA = existing.getOrDefault(A, new Node(A));
            Node nodeB = existing.getOrDefault(B, new Node(B));
            
            // Add edges between nodes with corresponding division results
            nodeA.dividedBy.put(nodeB, values[i]);
            nodeB.dividedBy.put(nodeA, 1 / values[i++]); // Reciprocal when inverted
            
            // Store the nodes in the map
            existing.putIfAbsent(A, nodeA);
            existing.putIfAbsent(B, nodeB);
        }

        
        i = 0; // Pointer to place answers in correct index
        double[] answers = new double[queries.size()];
        // Process each query
        for (List<String> query : queries){
            String A = query.get(0);
            String B = query.get(1);
            
            Node nodeA = existing.get(A);
            Node nodeB = existing.get(B);
  
            // Perform DFS to find the result of A / B
            answers[i++] = dfs(1.0,nodeA, nodeB, new HashSet<>());
        }
        
        return answers;
    }
    
    /**
     * Performs a Depth-First Search to find the result of dividend / target (divisor)
     * @param calc      The current calculated value during the DFS traversal. Starts at 1.0
     * @param dividend  The current node being visited (representing the dividend)
     * @param target    The target node to reach (representing the divisor)
     * @param visited   A set to keep track of visited nodes to prevent cycles
     * @return          The result of the division (original dividend / target) or -1 if not found
     */
    private double dfs(Double calc, Node dividend, Node target, Set<Node> visited){
        // Base case: Invalid input
        if (dividend == null || target == null) return -1;
        // Base case: Target found
        if (dividend.dividedBy.containsKey(target)){
            return calc * dividend.dividedBy.get(target);
        }
        // Mark current node as visited
        visited.add(dividend);
        
        double res = -1;
        // Explore neighbors of the current node
        for (Node neighbor : dividend.dividedBy.keySet()){
            
            // Only proceed with recursive search if connection node hasn't been visited yet.
            if (!visited.contains(neighbor)){
                // The quotient of current dividend by current divisor(connection)
                double quotient = dividend.dividedBy.get(neighbor);
                res = dfs(calc * quotient, neighbor, target, visited);
                
                // If path is found, return the result
                if (res != -1) return res;
            }
        }
        
        return res; // No path found from this node
    }
}
