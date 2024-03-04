package leetcode.maximumdepthofbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testMaxDepth(TreeNode root, int expected) {
        // Act
        int actual = sut.maxDepth(root);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMaxDepth() {
        return Stream.of(
                arguments(new TreeNode(3, 9, 20, null, null, 15, 7), 3),
                arguments(new TreeNode(1, null, 2), 2));
    }
}
