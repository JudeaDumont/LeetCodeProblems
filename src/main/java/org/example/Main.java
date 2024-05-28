package org.example;

import java.util.Map;
import java.util.TreeMap;

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

    public static long maximumHappinessSumSLOW(int[] happiness, int k) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i : happiness) {
            if (treeMap.containsKey(i)) {
                treeMap.put(i, treeMap.get(i) + 1);
            } else {
                treeMap.put(i, 1);
            }
        }
        long max = 0;
        for (int i = 0; i < k; i++) {
            int selected = countingPullLastSLOW(treeMap) - i;
            max += Math.max(selected, 0);
        }

        return max;
    }

    public static int countingPullLastSLOW(TreeMap<Integer, Integer> treeMap) {
        Map.Entry<Integer, Integer> entry = treeMap.lastEntry();
        Integer value = entry.getKey();
        int count = entry.getValue() - 1;
        if (count == 0) {
            treeMap.pollLastEntry();
        } else {
            treeMap.put(value, count);
        }
        return value;
    }

    public static long maximumHappinessSumSLOWER(int[] happiness, int k) {
        boolean[] visited = new boolean[happiness.length];

        long total = 0;
        for (int i = 0; i < k; i++) {
            long max = Long.MIN_VALUE;
            int maxIndex = -1;
            for (int i1 = 0; i1 < happiness.length; i1++) {
                if (!visited[i1]) {
                    if (max < happiness[i1] - i) {
                        max = Math.max(happiness[i1] - i, 0);
                        maxIndex = i1;
                    }
                }
            }
            visited[maxIndex] = true;
            total += max;
        }
        return total;
    }
}