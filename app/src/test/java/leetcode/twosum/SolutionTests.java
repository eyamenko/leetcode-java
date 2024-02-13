package leetcode.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testTwoSum(int[] nums, int target, int[] expected) {
        // Act
        int[] actual = sut.twoSum(nums, target);

        // Assert
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testTwoSum() {
        return Stream.of(
                arguments(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
                arguments(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
                arguments(new int[] {3, 3}, 6, new int[] {0, 1}));
    }
}
