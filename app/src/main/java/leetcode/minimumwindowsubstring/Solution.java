package leetcode.minimumwindowsubstring;

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

        int windowStart, windowLength, sCount, tCount;
        windowStart = windowLength = sCount = tCount = 0;

        int[] sChars = new int[58];
        int[] tChars = new int[58];

        for (int i = 0; i < t.length(); i++) {
            int charIndex = t.charAt(i) - 'A';

            tChars[charIndex]++;

            if (tChars[charIndex] == 1) {
                tCount++;
            }
        }

        for (int left = 0, right = 0; right < s.length(); right++) {
            int charIndex = s.charAt(right) - 'A';

            if (tChars[charIndex] > 0) {
                sChars[charIndex]++;

                if (sChars[charIndex] == tChars[charIndex]) {
                    sCount++;
                }

                while (sCount == tCount) {
                    if (isNoLongerIncluded(s, left, sChars, tChars)) {
                        sCount--;
                    }
                    windowLength = right - left + 1;
                    windowStart = left;
                    left++;
                }
            }

            if (left < s.length() && windowLength > 0) {
                if (isNoLongerIncluded(s, left, sChars, tChars)) {
                    sCount--;
                }
                left++;
            }
        }

        return s.substring(windowStart, windowStart + windowLength);
    }

    private boolean isNoLongerIncluded(String s, int left, int[] sChars, int[] tChars) {
        boolean isNoLongerIncluded = false;
        int charIndex = s.charAt(left) - 'A';

        if (tChars[charIndex] > 0) {
            isNoLongerIncluded = sChars[charIndex] == tChars[charIndex];
            sChars[charIndex]--;
        }

        return isNoLongerIncluded;
    }
}
