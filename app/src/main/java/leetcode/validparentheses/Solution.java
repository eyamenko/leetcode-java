package leetcode.validparentheses;

import java.util.ArrayDeque;
import java.util.Map;

/*
 * https://leetcode.com/problems/valid-parentheses/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        var capacity = s.length() / 2;
        var stack = new ArrayDeque<Character>(capacity);
        var parentheses = Map.of('}', '{', ']', '[', ')', '(');

        for (int i = 0; i < s.length(); i++) {
            if (parentheses.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || parentheses.get(s.charAt(i)) != stack.pop()) {
                    return false;
                }
            } else {
                if (stack.size() == capacity) {
                    return false;
                }

                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
