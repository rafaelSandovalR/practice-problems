/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package container_with_most_water;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxArea(int[] height){
   
        int currentVol, maxVol = 0, minHeight = 0;
        
        for(int i = 0, j = height.length-1; i < j;){
            
            minHeight = Math.min(height[i], height[j]);
            
            currentVol = minHeight * (j-i);
            
            if(currentVol > maxVol){ maxVol = currentVol; }
            
            while(i<j && height[i] <= minHeight){
                i++;
            }
            while(i<j && height[j] <= minHeight){
                j--;
            }
        }
        return maxVol;
    }
}
