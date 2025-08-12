/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candy;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int candy(int[] ratings){
        int n = ratings.length, count = 0;
        int[] ans = new int[n];
        
        ans[0] = 1;
        for (int i = 1, pre = i-1; i < n; i++, pre++){
            ans[i] = 1;
            if (ratings[i] > ratings[pre]) ans[i] = ans[pre] + 1;
        }
        
        for (int post = n-1, i = post-1; post > 0; post--, i--){
            if (ratings[i] > ratings[post]) ans[i] = Math.max(ans[i], ans[post] + 1);
            count += ans[i];
        }
        
        
        return count + ans[n-1];
    }
}
