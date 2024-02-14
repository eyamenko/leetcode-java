package leetcode.containerwithmostwater;

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
    void testMaxArea(int[] height, int expected) {
        // Act
        int actual = sut.maxArea(height);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMaxArea() {
        return Stream.of(
                arguments(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                arguments(new int[] {1, 1}, 1));
    }
}
