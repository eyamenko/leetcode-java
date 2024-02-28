package leetcode.climbingstairs;

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
    void testClimbStairs(int n, int expected) {
        // Act
        int actual = sut.climbStairs(n);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testClimbStairs() {
        return Stream.of(arguments(2, 2), arguments(3, 3));
    }
}
