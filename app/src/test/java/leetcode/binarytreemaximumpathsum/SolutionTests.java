package leetcode.binarytreemaximumpathsum;

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
    void testMaxPathSum(TreeNode root, int expected) {
        // Act
        int actual = sut.maxPathSum(root);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMaxPathSum() {
        return Stream.of(
                arguments(new TreeNode(1, 2, 3), 6),
                arguments(new TreeNode(-10, 9, 20, null, null, 15, 7), 42));
    }
}
