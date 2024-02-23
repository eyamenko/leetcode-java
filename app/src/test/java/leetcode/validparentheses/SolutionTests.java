package leetcode.validparentheses;

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
    void testIsValid(String s, boolean expected) {
        // Act
        boolean actual = sut.isValid(s);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testIsValid() {
        return Stream.of(arguments("()", true), arguments("()[]{}", true), arguments("(]", false));
    }
}
