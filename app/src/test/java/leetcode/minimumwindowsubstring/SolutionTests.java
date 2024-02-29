package leetcode.minimumwindowsubstring;

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
    void testMinWindow(String s, String t, String expected) {
        // Act
        String actual = sut.minWindow(s, t);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMinWindow() {
        return Stream.of(
                arguments("ADOBECODEBANC", "ABC", "BANC"),
                arguments("a", "a", "a"),
                arguments("a", "aa", ""));
    }
}
