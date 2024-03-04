package leetcode.besttimetobuyandsellstock;

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
    void testMaxProfit(int[] prices, int expected) {
        // Act
        int actual = sut.maxProfit(prices);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMaxProfit() {
        return Stream.of(
                arguments(new int[] {7, 1, 5, 3, 6, 4}, 5),
                arguments(new int[] {7, 6, 4, 3, 1}, 0));
    }
}
