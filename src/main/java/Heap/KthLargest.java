package Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
    }

    public int add(int val) {
        queue.offer(val);
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i] = queue.poll();
        }
        for (int i = 0; i < ints.length; i++) {
            queue.offer(ints[i]);
        }
        return ints[k - 1];
    }

    public static void main(String[] args) {
        KthLargest kthLargest =  new KthLargest(3,new int[]{4,5,8,2});
        kthLargest.add(3);   // returns 4
        kthLargest.add(5);   // returns 5
        kthLargest.add(10);  // returns 5
        kthLargest.add(9);   // returns 8
        kthLargest.add(4);   // returns 8
    }
}
