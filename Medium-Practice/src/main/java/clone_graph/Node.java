/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clone_graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Node {
    int val;
    List<Node> neighbors;
    
    Node() { val = 0; neighbors = new ArrayList<>();}
    
    Node(int val) { this.val = val; neighbors = new ArrayList<>(); }
    
    Node(int val, List<Node> neighbors) { this.val = val; this.neighbors = neighbors; }
}
