package leetcode.mergeintervals;

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
    void testMerge(int[][] intervals, int[][] expected) {
        // Act
        int[][] actual = sut.merge(intervals);

        // Assert
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testMerge() {
        return Stream.of(
                arguments(
                        new int[][] {
                            new int[] {1, 3},
                            new int[] {2, 6},
                            new int[] {8, 10},
                            new int[] {15, 18}
                        },
                        new int[][] {new int[] {1, 6}, new int[] {8, 10}, new int[] {15, 18}}),
                arguments(
                        new int[][] {new int[] {1, 4}, new int[] {4, 5}},
                        new int[][] {new int[] {1, 5}}));
    }
}
