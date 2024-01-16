/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_getRandom_o1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class RandomizedSet {
    
    HashMap<Integer, Integer> indexmap = new HashMap<Integer, Integer>();
    List<Integer> set = new ArrayList<>();
    
    public RandomizedSet(){

    
    }
    
    public boolean insert(int val){
        if(indexmap.get(val) == null){ 
            indexmap.put(val, set.size());
            set.add(val);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(int val){
        if(indexmap.get(val) != null){
            int ind = indexmap.get(val);
            set.remove(ind);
            indexmap.remove(val);
            return true;
        }
        
        return false;
    }
    
    public  int getRandom(){
        int randomIndex = (int)((Math.random() * set.size()-1) + 1);
        return(set.get(randomIndex));
    }
}
