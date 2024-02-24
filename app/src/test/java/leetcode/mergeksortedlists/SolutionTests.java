package leetcode.mergeksortedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import leetcode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTests {
    private static final Solution sut = new Solution();

    @ParameterizedTest
    @MethodSource
    void testMergeKLists(ListNode[] lists, ListNode expected) {
        // Act
        var actual = sut.mergeKLists(lists);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testMergeKLists() {
        return Stream.of(
                arguments(
                        new ListNode[] {
                            new ListNode(new int[] {1, 4, 5}),
                            new ListNode(new int[] {1, 3, 4}),
                            new ListNode(new int[] {2, 6})
                        },
                        new ListNode(new int[] {1, 1, 2, 3, 4, 4, 5, 6})),
                arguments(new ListNode[0], null),
                arguments(new ListNode[] {null}, null));
    }
}
