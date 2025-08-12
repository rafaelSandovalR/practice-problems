/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candy;

/**
 *
 * @author Rsand
 */
public class OptimalSolution {
    public int candy(int[] ratings){
        int n = ratings.length, total = 1, i = 1;
        
        while (i < n){
            if (ratings[i] == ratings[i - 1]) {
                total++; i++; continue;
            }

            int peak = 1;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++; i++;
                total += peak;
            }

            int down = 1;
            while (i < n && ratings[i] < ratings[i - 1]) {
                total += down;
                down++; i++;
            }

            if (peak < down)
                total += (down - peak);            
        }
        
        
        return total;
    }
}
