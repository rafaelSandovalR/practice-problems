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
        
        if (numRows == 1) return s;
        
        int n = s.length(), width = (2*numRows) - 2;
        char[] str = s.toCharArray();
        char[] converted = new char[n];

        for (int row = 0, write = 0; row < numRows; row++, width -= 2) {
            int read = row;
            while (read < n) {
                if (width > 0){
                    converted[write++] = str[read];
                    read += width;
                }

                if (read < n && row * 2 > 0) {
                    converted[write++] = str[read];
                    read += row * 2;
                }
            }
        }

        return new String(converted);
    }
}
