package leetcode.searchinrotatedsortedarray;

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
    void testSearch(int[] nums, int target, int expected) {
        // Act
        int actual = sut.search(nums, target);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testSearch() {
        return Stream.of(
                arguments(new int[] {4, 5, 6, 7, 0, 1, 2}, 0, 4),
                arguments(new int[] {4, 5, 6, 7, 0, 1, 2}, 3, -1),
                arguments(new int[] {1}, 0, -1));
    }
}
