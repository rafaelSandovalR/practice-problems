/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package container_with_most_water;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int maxArea(int[] height){
        
        int left = 0, right = height.length - 1, maxArea = 0;
        
        while (left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            
            maxArea = Math.max(maxArea,area);
            
            if (height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }
}
