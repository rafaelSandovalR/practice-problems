/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package summary_ranges;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<String> summaryRanges(int[] nums){
        List<String> ans = new ArrayList<String>();

        
        for (int i = 0; i < nums.length; i++){
            StringBuilder sb = new StringBuilder();
            boolean firstTime = true;
            sb.append(nums[i]);
            
            while (i < nums.length - 1 && nums[i+1] == nums[i]+1){
                if (firstTime){
                    sb.append("->");
                    firstTime = false;
                }
                i++;
            }
            
            if (!firstTime){
                sb.append(nums[i]);
            }
            
            ans.add(sb.toString());
        }
        
        return ans;
    }
}
