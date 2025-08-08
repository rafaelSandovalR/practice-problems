/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candy;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int candy(int[] ratings){
        int[] ans = new int[ratings.length];
        fill(ratings, ans, 0);
        
        int total = 0;
        for(int count : ans){
            total += count;
        }
        return total;
    }
    
    private void fill(int[] ratings, int[] ans, int idx){
        int n = ratings.length, pre = idx-1, post = idx+1;
        if (idx == n) return;
        ans[idx]++;
        if (idx > 0 && ratings[pre] < ratings[idx]) ans[idx] = ans[pre] + 1;
        fill(ratings,ans,post);
        if (post < n && ratings[post] < ratings[idx]) ans[idx] = Math.max(ans[idx], ans[post] + 1);
    }
}
