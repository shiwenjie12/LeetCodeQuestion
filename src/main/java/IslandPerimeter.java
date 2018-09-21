public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int count = 0;
        int xlength = grid.length;
        int ylength = grid[0].length;
        for (int i = 0; i < xlength; i++) {
            for (int j = 0; j < ylength; j++) {
                if (grid[i][j] == 1){
                    count = count + 4;
                    if (i - 1 >= 0)
                        if (grid[i - 1][j] == 1)
                            count = count - 1;
                    if (i + 1 < xlength)
                        if (grid[i + 1][j] == 1)
                            count = count - 1;
                    if (j - 1 >= 0)
                        if (grid[i][j - 1] == 1)
                            count = count - 1;
                    if (j + 1 < ylength)
                        if (grid[i][j + 1] == 1)
                            count = count - 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        islandPerimeter(new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        });
    }
}


