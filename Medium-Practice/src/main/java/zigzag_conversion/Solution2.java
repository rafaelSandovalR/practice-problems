/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zigzag_conversion;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public String convert(String s, int numRows){
        int n = s.length();
        char[] str = s.toCharArray();
        char[] converted = new char[n];

        for (int row = 0, insert = 0; row < numRows; row++) {
            int i = row;
            while (i < n && insert < n) {
                converted[insert++] = str[i];
                i += row == numRows-1 ? 2 * numRows - 2 : 2 * (numRows - row) - 2;

                if (i < n && row > 0 && row < numRows - 1) {
                    converted[insert++] = str[i];
                    i += 2 * row;
                }
            }
        }

        return new String(converted);
    }
}
