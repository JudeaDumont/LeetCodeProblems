import org.example.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.addTwoNumbers;

public class TestAddNum {
    @Test
    void testTwoSum() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        ListNode result = addTwoNumbers(l1, l2);
        Assertions.assertEquals(result.val, 7);
        Assertions.assertEquals(result.next.val, 0);
        Assertions.assertEquals(result.next.next.val, 8);
    }

    @Test
    void testTwoSum2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);


        ListNode result = addTwoNumbers(l1, l2);
        Assertions.assertEquals(result.val, 0);
    }

    @Test
    void testTwoSum3() {
        ListNode l1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));


        ListNode result = addTwoNumbers(l1, l2);
        Assertions.assertEquals(result.val, 8);
        Assertions.assertEquals(result.next.val, 9);
        Assertions.assertEquals(result.next.next.val, 9);
        Assertions.assertEquals(result.next.next.next.val, 9);
        Assertions.assertEquals(result.next.next.next.next.val, 0);
        Assertions.assertEquals(result.next.next.next.next.next.val, 0);
        Assertions.assertEquals(result.next.next.next.next.next.next.val, 0);
        Assertions.assertEquals(result.next.next.next.next.next.next.next.val, 1);

        //8,9,9,9,0,0,0,1
    }
}
