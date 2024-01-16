/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_getRandom_o1;

import java.util.HashMap;

/**
 *
 * @author Rsand
 */
public class RandomizedSet {
    
    HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
    
    public RandomizedSet(){

    
    }
    
    public boolean insert(int val){
        if(set.get(val) == null){ 
            set.put(val, val);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(int val){
        if(set.get(val) != null){
            set.remove(val);
            return true;
        }
        
        return false;
    }
    
    public  int getRandom(){

    }
}
