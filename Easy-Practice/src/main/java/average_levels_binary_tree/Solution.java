/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package average_levels_binary_tree;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Rsand
 */
class Solution {

    public static List<Double> averageOfLevels(TreeNode root) {
        // Returns a new anonymous class 
        return new AbstractList<Double>() {

            private final List<Double> list = new ArrayList<>(); // Stores the calculated averages for each level
            private final List<TreeNode> level = new ArrayList<>(); // Stores nodes encountered during level-by-level traversal

            // Retreives the average value at a specific level from the list
            @Override
            public Double get(int index) {
                init();
                return list.get(index);
            }

            // Returns the total number of levels in the tree
            @Override
            public int size() {
                init();
                return list.size();
            }

            // Both previous methods call this.
            // Ensures that the list is populated with average values before
            void init() {
                if (list.isEmpty()) {
                    level.add(root);
                    // Until level is empty meaning all levels have been processed
                    while (!level.isEmpty()) {
                        levelTraverse(level); //Traverse the current level
                    }
                }
            }

            // Takes list of tree nodes as current level
            void levelTraverse(List<TreeNode> level) {
                int count = level.size();
                long sum = 0;
                // Iterates through each node in the level
                for (int i = 0; i < count; i++) {
                    TreeNode tree = level.get(0);
                    sum += tree.val;
                    
                    // Adds children to level list for processing in the next level
                    if (tree.left != null) {
                        level.add(tree.left);
                    }
                    if (tree.right != null) {
                        level.add(tree.right);
                    }
                    // Remove head to move to the next node
                    level.remove(0);
                }
                // Adds the calculated average to the list
                list.add((double) sum / count);
            }
        };
    }
}
