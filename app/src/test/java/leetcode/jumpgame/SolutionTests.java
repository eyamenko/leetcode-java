package leetcode.jumpgame;

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
    void testCanJump(int[] nums, boolean expected) {
        // Act
        boolean actual = sut.canJump(nums);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testCanJump() {
        return Stream.of(
                arguments(new int[] {2, 3, 1, 1, 4}, true),
                arguments(new int[] {3, 2, 1, 0, 4}, false));
    }
}
