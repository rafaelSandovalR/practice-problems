/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isomorphic_strings;



/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isIsomorphic(String s, String t){
        

        int[] a = new int[128];
        
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if (a[sCh] == 0) {
                for (int j = 0; j < 128; j++) {
                    if (a[j] == tCh) {
                        return false;
                    }
                }
                a[sCh] = tCh;
            } else if (a[sCh] != tCh) {
                return false;
            }

        }
        return true;

    }
}
