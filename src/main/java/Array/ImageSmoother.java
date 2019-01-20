package Array;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int a = M.length;
        int b = M[0].length;
        int[][] x = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                x[i][j] = avg(i, j, a, b, M);
            }
        }
        return x;
    }

    public int avg(int i,int j,int a,int b,int[][]M){
        int cur = M[i][j];
        int u = i - 1;
        int d = i + 1;
        int l = j - 1;
        int r = j + 1;
        int c=1;
        if(u>=0&&u<a&&l>=0&&l<b){
            c++;
            cur+=M[u][l];
        }
        if (u >= 0 && u < a) {
            c++;
            cur += M[u][j];
        }
        if (u >= 0 && u < a && r < b) {
            c++;
            cur += M[u][r];
        }
        if (r < b) {
            c++;
            cur += M[i][r];
        }
        if (r < b && d < a) {
            c++;
            cur += M[d][r];
        }
        if (d < a) {
            c++;
            cur += M[d][j];
        }
        if (d < a && l >= 0 && l < b) {
            c++;
            cur += M[d][l];
        }
        if (l >= 0 && l < b) {
            c++;
            cur += M[i][l];
        }
        return cur / c;
    }
}
