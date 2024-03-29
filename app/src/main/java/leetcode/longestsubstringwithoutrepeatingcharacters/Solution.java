package leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int maxLength = 0;
        var characters = new HashSet<Character>();

        for (int left = 0, right = 0; right < s.length(); right++) {
            if (characters.add(s.charAt(right))) {
                maxLength = Math.max(maxLength, characters.size());
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    characters.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
        }

        return maxLength;
    }
}
