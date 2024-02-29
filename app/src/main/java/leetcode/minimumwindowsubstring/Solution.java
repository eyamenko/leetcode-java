package leetcode.minimumwindowsubstring;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/minimum-window-substring/
 * Time complexity: O(m+n)
 * Space complexity: O(m)
 */
class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return new String();
        }

        int windowStart = 0;
        int windowLength = 0;
        var sChars = new HashMap<Character, Integer>();
        var tChars = new HashMap<Character, Integer>();

        for (int i = 0; i < t.length(); i++) {
            tChars.merge(t.charAt(i), 1, Integer::sum);
        }

        for (int left = 0, right = 0; right < s.length(); right++) {
            sChars.merge(s.charAt(right), 1, Integer::sum);

            while (isIncluded(sChars, tChars)) {
                windowLength = right - left + 1;
                windowStart = left;
                sChars.merge(s.charAt(left), -1, Integer::sum);
                left++;
            }

            if (left < s.length() && windowLength > 0) {
                sChars.merge(s.charAt(left), -1, Integer::sum);
                left++;
            }
        }

        return s.substring(windowStart, windowStart + windowLength);
    }

    private boolean isIncluded(Map<Character, Integer> sChars, Map<Character, Integer> tChars) {
        for (Map.Entry<Character, Integer> entry : tChars.entrySet()) {
            Integer count = sChars.get(entry.getKey());

            if (count == null || count < entry.getValue()) {
                return false;
            }
        }

        return true;
    }
}
