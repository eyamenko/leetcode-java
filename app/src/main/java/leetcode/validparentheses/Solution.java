package leetcode.validparentheses;

import java.util.ArrayDeque;

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

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);

            if (bracket == '{' || bracket == '[' || bracket == '(') {
                if (stack.size() == capacity) {
                    return false;
                }
                stack.push(bracket);
            } else {
                if (stack.isEmpty()
                        || (bracket == '}' && stack.pop() != '{')
                        || (bracket == ']' && stack.pop() != '[')
                        || (bracket == ')' && stack.pop() != '(')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
