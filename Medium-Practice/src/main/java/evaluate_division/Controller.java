/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluate_division;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<String>> equations = new ArrayList<>();
        List<String> equation1 = new ArrayList<>(Arrays.asList("a","b"));
        List<String> equation2 = new ArrayList<>(Arrays.asList("b","c"));
        List<String> equation3 = new ArrayList<>(Arrays.asList("bc","cd"));

        equations.add(equation1);
        equations.add(equation2);
        equations.add(equation3);
        
        double[] values = {1.5, 2.5, 5.0};
        
        List<List<String>> queries = new ArrayList<>();
        List<String> q1 = new ArrayList<>(Arrays.asList("a","c"));
        List<String> q2 = new ArrayList<>(Arrays.asList("c","b"));
        List<String> q3 = new ArrayList<>(Arrays.asList("bc","cd"));
        
        queries.add(q1);
        queries.add(q2);
        queries.add(q3);
        
        
        double[] res = sol.calcEquation(equations, values, queries);
    }
}
