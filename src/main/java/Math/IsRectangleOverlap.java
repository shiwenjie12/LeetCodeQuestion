package Math;

public class IsRectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean flagx = false;
        if (rec1[0] < rec2[0]) {
            if (rec1[2] > rec2[0]) {
                flagx = true;
            }
        } else {
            if (rec2[2] > rec1[0]) {
                flagx = true;
            }
        }
        boolean flagy = false;
        if (rec1[1] < rec2[1]) {
            if (rec1[3] > rec2[1]) {
                flagy = true;
            }
        } else {
            if (rec2[3] > rec1[1]) {
                flagy = true;
            }
        }
        return flagx && flagy;
    }
}
