package LinkedList;

import java.util.List;
import java.util.Stack;

public class IsPalindrome {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        Stack stack = new Stack();
        ListNode node = head;
        while (node != null){
            stack.push(node);
            node = node.next;
        }
        node = head;
        while (node != null){
            if (node.val != ((ListNode) stack.pop()).val)
                return false;
            node = node.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(2);
        ListNode node9 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;
        new IsPalindrome().isPalindrome(node1);
    }
}


