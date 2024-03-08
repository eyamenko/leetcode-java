package leetcode.clonegraph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import leetcode.Node;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testCloneGraph(Node node, Node expected) {
        // Act
        Node actual = sut.cloneGraph(node);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testCloneGraph() {
        return Stream.of(
                arguments(
                        new Node(
                                new int[] {2, 4},
                                new int[] {1, 3},
                                new int[] {2, 4},
                                new int[] {1, 3}),
                        new Node(
                                new int[] {2, 4},
                                new int[] {1, 3},
                                new int[] {2, 4},
                                new int[] {1, 3})),
                arguments(new Node(1), new Node(1)),
                arguments(null, null));
    }
}
