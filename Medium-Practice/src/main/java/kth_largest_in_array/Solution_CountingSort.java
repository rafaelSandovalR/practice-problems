/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_largest_in_array;

/**
 *
 * @author Rsand
 */
public class Solution_CountingSort {
    public int findKthLargest(int[] nums, int k){
        /*
            Create a count array to store the frequency of each number.
            The input numbers can range from -10,000 to 10,000
            To avoid negative indices, we shift the range by adding 10,000
            So, -10,000 becomes index 0, and 10,000 becomes index 20,000
         */
        int[] count = new int[20001];
        
        // Iterate through input array and count the frequency of each number
        for (int num : nums){
            count[num + 10000]++;
        }
        
        // Iterate through the count array in reverse order
        for (int i = count.length - 1; i >= 0; i--){
            // If current number has occurred at least once:
            if (count[i] > 0){
                k -= count[i]; // Subtract count of current number from k
                
                // If k becomes less than one, we have found the kth largest number
                if (k <= 0) return i - 10000; // Adjust by offset
            }
        }
        // This should ideally not be reached, kept for sake of completeness
        return -1;
    }
}
