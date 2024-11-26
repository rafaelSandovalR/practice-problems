/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluate_division;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Node {
    String variable;
    Map<Node, Double> dividedBy;
    
    Node(String variable) {this.variable = variable; dividedBy = new HashMap<>();}
}
