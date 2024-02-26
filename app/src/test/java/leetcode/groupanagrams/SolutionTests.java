package leetcode.groupanagrams;

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
    void testGroupAnagrams(String[] strs, List<List<String>> expected) {
        // Act
        List<List<String>> actual = sut.groupAnagrams(strs);

        // Assert
        assertIterableEquals(expected, actual);
    }

    static Stream<Arguments> testGroupAnagrams() {
        return Stream.of(
                arguments(
                        new String[] {"eat", "tea", "tan", "ate", "nat", "bat"},
                        List.of(
                                List.of("tan", "nat"),
                                List.of("eat", "tea", "ate"),
                                List.of("bat"))),
                arguments(new String[] {""}, List.of(List.of(""))),
                arguments(new String[] {"a"}, List.of(List.of("a"))));
    }
}
