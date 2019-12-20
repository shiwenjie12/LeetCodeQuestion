//package Array;
//
//public class MaxDistToClosest {
//    public int maxDistToClosest(int[] seats) {
//        int res = 0;
//        int max = 0;
//        int start = -1;
//        for (int i = 0; i < seats.length; i++) {
//            if (seats[i] == 1) {
//                if (start == -1) {
//                    max = i;
//                } else {
//                    max = (int) Math.max(Math.floor(((i + start) / 2)) - start, max);
//                }
//                start = i;
//            }
//        }
//    }
//}
