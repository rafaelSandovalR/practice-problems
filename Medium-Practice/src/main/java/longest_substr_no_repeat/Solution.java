/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longest_substr_no_repeat;


/**
 *
 * @author Rsand
 */
class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        // Assuming the character set is ASCII, we can use an array of size 128.
        int[] index = new int[128]; // All values are initialized to 0

        int max = 0;
        for (int i = 0, left = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int test = c;
            left = Math.max(left, index[c]); // Update left to the position right after the last occurrence of the character

            // Calculate the length of the current substring and update max
            max = Math.max(max, i - left + 1);

            // Update the last seen index of the character
            index[c] = i + 1; // Storing i + 1 because initial values are 0
        }

        return max;
    }
}
