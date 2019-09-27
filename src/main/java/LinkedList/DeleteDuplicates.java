package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicates {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            int curNumber = cur.val;
            while (cur.next != null && cur.next.val == curNumber) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
