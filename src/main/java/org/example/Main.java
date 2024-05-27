package org.example;

public class Main {
    public static void main(String[] args) {

        int i = specialArray(new int[]{3, 5});
        assert (i == 2);
    }

    public static int specialArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int x = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i + 1) {
                    ++x;
                }
            }
            if (x == i + 1) {
                return x;
            }
        }
        return -1;
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int inbetween = target - nums[i];
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (inbetween - nums[i1] == 0) {
                    return new int[]{i, i1};
                }
            }
        }
        return new int[]{};
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        int carry = 0;
        boolean run = true;
        while (run) {
            if (l1 == null) {
                l1 = new ListNode();
            }
            if (l2 == null) {
                l2 = new ListNode();
            }
            int val = l1.val + l2.val + carry;
            carry = val / 10;
            if (val > 9) {
                val %= 10;
            }
            current.val = val;
            l1 = l1.next;
            l2 = l2.next;

            if (l1 != null || l2 != null || carry != 0) {
                current.next = new ListNode();
                current = current.next;
            } else {
                run = false;
            }
        }
        return result;
    }
}