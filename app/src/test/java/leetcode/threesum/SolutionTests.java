package leetcode.threesum;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testThreeSum(int[] nums, List<List<Integer>> expected) {
        // Act
        List<List<Integer>> actual = sut.threeSum(nums);

        // Assert
        assertIterableEquals(expected, actual);
    }

    static Stream<Arguments> testThreeSum() {
        return Stream.of(
                arguments(
                        new int[] {-1, 0, 1, 2, -1, -4},
                        List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                arguments(new int[] {0, 1, 1}, List.of()),
                arguments(new int[] {0, 0, 0}, List.of(List.of(0, 0, 0))));
    }
}
