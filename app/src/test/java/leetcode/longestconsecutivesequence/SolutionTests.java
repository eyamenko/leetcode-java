package leetcode.longestconsecutivesequence;

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
    void testLongestConsecutive(int[] nums, int expected) {
        // Act
        int actual = sut.longestConsecutive(nums);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testLongestConsecutive() {
        return Stream.of(
                arguments(new int[] {100, 4, 200, 1, 3, 2}, 4),
                arguments(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9));
    }
}
