package leetcode.decodeways;

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
    void testNumDecodings(String s, int expected) {
        // Act
        int actual = sut.numDecodings(s);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testNumDecodings() {
        return Stream.of(arguments("12", 2), arguments("226", 3), arguments("06", 0));
    }
}
