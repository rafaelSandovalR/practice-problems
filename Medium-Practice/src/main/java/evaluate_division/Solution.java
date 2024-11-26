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
        
        int i = 0;
        Map<String, Node> existing = new HashMap<>();
        
        for (List<String> equation : equations){
            // Equation = A / B
            String A = equation.get(0);
            String B = equation.get(1);
            Node nodeA = existing.getOrDefault(A, new Node(A));
            Node nodeB = existing.getOrDefault(B, new Node(B));
            
            nodeA.dividedBy.put(nodeB, values[i]);
            nodeB.dividedBy.put(nodeA, 1 / values[i++]);
            
            existing.putIfAbsent(A, nodeA);
            existing.putIfAbsent(B, nodeB);
        }

        i = 0;        
        double[] answers = new double[queries.size()];
        for (List<String> query : queries){
            String A = query.get(0);
            String B = query.get(1);
            
            Node nodeA = existing.get(A);
            Node nodeB = existing.get(B);
  
            answers[i++] = dfs(1.0,nodeA, nodeB, new HashSet<>());
        }
        
        return answers;
    }
    
    private double dfs(Double calc, Node dividend, Node target, Set<Node> visited){
        if (dividend == null || target == null) return -1;
        
        if (dividend.dividedBy.containsKey(target)){
            return calc * dividend.dividedBy.get(target);
        }
        // Add current node to visited set to avoid loops
        visited.add(dividend);
        
        double res = -1;
        // Search each connection to the dividend
        for (Node connection : dividend.dividedBy.keySet()){
            
            // Only proceed with recursive search if connection node hasn't been visited yet.
            if (!visited.contains(connection)){
                // The quotient of current dividend by current divisor(connection)
                double quotient = dividend.dividedBy.get(connection);
                res = dfs(calc * quotient, connection, target, visited);
                
                if (res != -1) return res;
            }
        }
        
        return res;
    }
}
