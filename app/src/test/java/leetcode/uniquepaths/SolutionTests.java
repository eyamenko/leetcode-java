package leetcode.uniquepaths;

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
    void testUniquePaths(int m, int n, int expected) {
        // Act
        int actual = sut.uniquePaths(m, n);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testUniquePaths() {
        return Stream.of(arguments(3, 7, 28), arguments(3, 2, 3));
    }
}
