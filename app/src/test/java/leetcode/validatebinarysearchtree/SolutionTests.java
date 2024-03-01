package leetcode.validatebinarysearchtree;

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
    void testIsValidBST(TreeNode root, boolean expected) {
        // Act
        boolean actual = sut.isValidBST(root);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testIsValidBST() {
        return Stream.of(
                arguments(new TreeNode(2, 1, 3), true),
                arguments(new TreeNode(5, 1, 4, null, null, 3, 6), false));
    }
}
