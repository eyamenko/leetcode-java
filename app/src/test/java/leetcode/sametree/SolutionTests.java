package leetcode.sametree;

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
    void testIsSameTree(TreeNode p, TreeNode q, boolean expected) {
        // Act
        boolean actual = sut.isSameTree(p, q);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testIsSameTree() {
        return Stream.of(
                arguments(new TreeNode(1, 2, 3), new TreeNode(1, 2, 3), true),
                arguments(new TreeNode(1, 2), new TreeNode(1, null, 2), false),
                arguments(new TreeNode(1, 2, 1), new TreeNode(1, 1, 2), false));
    }
}
