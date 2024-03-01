package leetcode.binarytreelevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;
import leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testLevelOrder(TreeNode root, List<List<Integer>> expected) {
        // Act
        List<List<Integer>> actual = sut.levelOrder(root);

        // Assert
        assertIterableEquals(expected, actual);
    }

    static Stream<Arguments> testLevelOrder() {
        return Stream.of(
                arguments(
                        new TreeNode(3, 9, 20, null, null, 15, 7),
                        List.of(List.of(3), List.of(9, 20), List.of(15, 7))),
                arguments(new TreeNode(1), List.of(List.of(1))),
                arguments(null, List.of()));
    }
}
