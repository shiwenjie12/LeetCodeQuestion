public class MergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ls = head;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null)
            head.next = l2;
        else
            head.next = l1;
        return ls.next;
    }

    public void test(){
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(2);
        ListNode l1_3 = new ListNode(4);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(1);
        ListNode l2_2 = new ListNode(2);
        ListNode l2_3 = new ListNode(3);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        ListNode cc = mergeTwoLists(l1_1,l2_1);
    }

    public static void  main(String[] args){
        int cc = 0x3FFF;
        MergeTwoLists df = new MergeTwoLists();
        df.test();
    }
}
