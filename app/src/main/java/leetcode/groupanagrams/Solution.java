package leetcode.groupanagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * https://leetcode.com/problems/group-anagrams/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }

        var anagrams = new HashMap<String, List<String>>();

        for (String str : strs) {
            char[] chars = new char[26];

            for (int i = 0; i < str.length(); i++) {
                chars[str.charAt(i) - 'a']++;
            }

            anagrams.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
