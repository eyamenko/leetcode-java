package leetcode.insertinterval;

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
    void testInsert(int[][] intervals, int[] newInterval, int[][] expected) {
        // Act
        int[][] actual = sut.insert(intervals, newInterval);

        // Assert
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testInsert() {
        return Stream.of(
                arguments(
                        new int[][] {new int[] {1, 3}, new int[] {6, 9}},
                        new int[] {2, 5},
                        new int[][] {new int[] {1, 5}, new int[] {6, 9}}),
                arguments(
                        new int[][] {
                            new int[] {1, 2},
                            new int[] {3, 5},
                            new int[] {6, 7},
                            new int[] {8, 10},
                            new int[] {12, 16}
                        },
                        new int[] {4, 8},
                        new int[][] {new int[] {1, 2}, new int[] {3, 10}, new int[] {12, 16}}));
    }
}
