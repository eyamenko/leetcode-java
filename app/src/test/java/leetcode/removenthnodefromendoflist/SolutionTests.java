package leetcode.removenthnodefromendoflist;

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
    void testRemoveNthFromEnd(ListNode head, int n, ListNode expected) {
        // Act
        ListNode actual = sut.removeNthFromEnd(head, n);

        // Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> testRemoveNthFromEnd() {
        return Stream.of(
                arguments(
                        new ListNode(
                                1,
                                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        2,
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))),
                arguments(new ListNode(1), 1, null),
                arguments(new ListNode(1, new ListNode(2)), 1, new ListNode(1)));
    }
}
