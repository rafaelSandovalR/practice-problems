/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_getRandom_o1;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(0);
        boolean param_2 = obj.insert(1);
        boolean param_3 = obj.remove(0);
        boolean param_4 = obj.insert(2);
        boolean param_5 = obj.remove(1);
        int param_6 = obj.getRandom();
        
        System.out.println(param_6);
    }
    
}
