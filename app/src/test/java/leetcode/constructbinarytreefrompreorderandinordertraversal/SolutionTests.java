package leetcode.constructbinarytreefrompreorderandinordertraversal;

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
    void testBuildTree(int[] preorder, int[] inorder, TreeNode expected) {
        // Act
        TreeNode actual = sut.buildTree(preorder, inorder);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testBuildTree() {
        return Stream.of(
                arguments(
                        new int[] {3, 9, 20, 15, 7},
                        new int[] {9, 3, 15, 20, 7},
                        new TreeNode(3, 9, 20, null, null, 15, 7)),
                arguments(new int[] {-1}, new int[] {-1}, new TreeNode(-1)));
    }
}
