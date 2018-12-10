package LinkedList;

import java.util.List;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curNode = head;
        int flag = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + flag;
            if (temp >= 10) {
                temp = temp - 10;
                flag = 1;
            } else {
                flag = 0;
            }
            ListNode node = new ListNode(temp);
            curNode.next = node;
            curNode = node;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null){
            while (l1 != null){
                int temp = l1.val + flag;
                if (temp >= 10){
                    temp = temp - 10;
                    flag = 1;
                }else {
                    flag = 0;
                }
                ListNode node = new ListNode(temp);
                curNode.next = node;
                curNode = node;
                l1 = l1.next;
            }
        }
        if (l2 != null){
            while (l2 != null){
                int temp = l2.val + flag;
                if (temp >= 10){
                    temp = temp - 10;
                    flag = 1;
                }else {
                    flag = 0;
                }
                ListNode node = new ListNode(temp);
                curNode.next = node;
                curNode = node;
                l2 = l2.next;
            }
        }
        if (flag == 1){
            curNode.next = new ListNode(1);
        }
        return head.next;
    }
}
