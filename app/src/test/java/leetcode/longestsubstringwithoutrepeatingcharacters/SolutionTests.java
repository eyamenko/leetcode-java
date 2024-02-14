package leetcode.longestsubstringwithoutrepeatingcharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testLengthOfLongestSubstring(String s, int expected) {
        // Act
        int actual = sut.lengthOfLongestSubstring(s);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testLengthOfLongestSubstring() {
        return Stream.of(arguments("abcabcbb", 3), arguments("bbbbb", 1), arguments("pwwkew", 3));
    }
}
