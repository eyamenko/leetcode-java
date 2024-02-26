package leetcode.maximumsubarray;

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
    void testMaxSubArray(int[] nums, int expected) {
        // Act
        int actual = sut.maxSubArray(nums);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMaxSubArray() {
        return Stream.of(
                arguments(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                arguments(new int[] {1}, 1),
                arguments(new int[] {5, 4, -1, 7, 8}, 23));
    }
}
