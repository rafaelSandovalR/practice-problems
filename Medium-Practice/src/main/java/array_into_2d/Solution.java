/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_into_2d;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> findMatrix(int[] nums){
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        
        quickSort(nums, 0 , nums.length-1);
        
        int rowCount = 1, freq = 1;
        boolean singular = true;
        List<Integer> sub = new ArrayList<Integer>();
        matrix.add(sub);
        
        for(int i = 0, j = 0; i < nums.length; i++){
            
            //count how many freq there are
            while(i+1 != nums.length && nums[i] == nums[i+1]){
                freq++;
                i++;
                singular = false;
            }
            
            //if single value add to the first sublist
            if(singular){
                sub.add(nums[i]);
            }
            else{
                //if freq values exist
                while (freq > 0) {
                    //loop to create rows if number of duplicates exceeds number of rows
                    while (freq > rowCount) {
                        List<Integer> nextSub = new ArrayList<Integer>();
                        //add new list to matrix
                        matrix.add(nextSub);
                        //increment row count
                        rowCount++;
                    }
                    //Add number to rows in reverse row order
                    matrix.get(freq - 1).add(nums[i]);
                    //decrement multi
                    freq--;
                }
            }

            
            //reset variables
            singular = true;
            freq = 1;
        }
        
        return matrix;
    }
    
    //alternate solution
    public List<List<Integer>> findMatrix2(int[] nums){
        /* 
        ALGORITHM
        
        Create an array freq of size nums.size() + 1 to store the frequency of integers in the array nums.
        Create an empty 2D array ans to store the answer array.
        Iterate over the array nums and for each integer c.
              a.If the frequency of the integer is greater than or equal to the current rows count in ans, then add a row to ans.
              b.Insert the integer c at the row freq[c].
              c.Increment the frequency of c in freq
        Return ans     
        */
        int[] freq = new int[nums.length + 1];
        ArrayList<List<Integer>> ans = new ArrayList<>();
        
        for(int num : nums){
            if(freq[num] >= ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(freq[num]).add(num);
            freq[num]++;
        }
        return ans;
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //takes last element as pivot
    public static int partition(int[]arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j = low; j <= high - 1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i , j);
            }
        }
        
        swap(arr, i+1, high);
        return i+1;
    }
}
