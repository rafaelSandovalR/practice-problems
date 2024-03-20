/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package same_tree;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return p == q;
        }
        
        if (p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
