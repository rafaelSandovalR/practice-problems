/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isIsomorphic(String s, String t){

        char[] ascii = new char[128];
        char[] ascii2 = new char[128];

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (ascii[sChar] == 0 && ascii2[tChar] == 0) {
                ascii[sChar] = tChar;
                ascii2[tChar] = sChar;
            } else if (ascii[sChar] == 0) {
                return false;
            } else if (ascii[sChar] != tChar) {
                return false;
            }

        }

        return true;

    }
}
