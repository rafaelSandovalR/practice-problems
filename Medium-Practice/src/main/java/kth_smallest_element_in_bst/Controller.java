/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_smallest_element_in_bst;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        TreeNode node10 = new TreeNode(11);
        TreeNode node9 = new TreeNode(13,node10, null);
        TreeNode node8 = new TreeNode(23);
        TreeNode node7 = new TreeNode(15,node9, null);
        TreeNode node6 = new TreeNode(7);
        TreeNode node5 = new TreeNode(1);
        TreeNode node4 = new TreeNode(20,node7,node8);
        TreeNode node3 = new TreeNode(4,node5,node6);
        TreeNode node2 = new TreeNode(10,node3,node4);
        TreeNode root = new TreeNode(25,node2,null);
        
        Solution sol = new Solution();
        
        int output = sol.kthSmallest(root, 5);
        
        Solution sol2 = new Solution();
        
        int numRuns = 100;
        List<Long> times = new ArrayList<>();
        
        for (int i = 0; i < numRuns; i++){
            long start = System.nanoTime();
            sol2.kthSmallest(root, 5);
            long end = System.nanoTime();
            times.add(end - start);
        }
        
        long totalTime = times.stream().mapToLong(Long::longValue).sum();
        double averageTime = (double) totalTime / numRuns / 1000000;
        System.out.println("Average time taken: " + averageTime + " milliseconds");
                
        
    }
}
