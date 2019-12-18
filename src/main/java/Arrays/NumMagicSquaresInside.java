package Arrays;

public class NumMagicSquaresInside {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int gridRowSize = grid.length;
        int gridColSizes = grid[0].length;
        if (gridRowSize < 3 || (gridColSizes) < 3)
            return count;
        for (int i = 0; i < gridRowSize - 2; i++)
            for (int j = 0; j < (gridColSizes) - 2; j++)
                if (grid[i][j] != grid[i + 1][j]
                        && grid[i][j] < 10 && grid[i][j + 1] < 10 && grid[i][j + 2] < 10
                        && grid[i + 1][j] < 10 && grid[i + 1][j + 1] < 10 && grid[i + 1][j + 2] < 10
                        && grid[i + 2][j] < 10 && grid[i + 2][j + 1] < 10 && grid[i + 2][j + 2] < 10
                        && grid[i][j] > 0 && grid[i][j + 1] > 0 && grid[i][j + 2] > 0
                        && grid[i + 1][j] > 0 && grid[i + 1][j + 1] > 0 && grid[i + 1][j + 2] > 0
                        && grid[i + 2][j] > 0 && grid[i + 2][j + 1] > 0 && grid[i + 2][j + 2] > 0
                        && (grid[i][j] + grid[i][j + 1] + grid[i][j + 2]) == (grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2])
                        && (grid[i][j] + grid[i][j + 1] + grid[i][j + 2]) == (grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2])
                        && (grid[i][j] + grid[i][j + 1] + grid[i][j + 2]) == (grid[i][j] + grid[i + 1][j] + grid[i + 2][j])
                        && (grid[i][j] + grid[i + 1][j] + grid[i + 2][j]) == (grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1])
                        && (grid[i][j] + grid[i + 1][j] + grid[i + 2][j]) == (grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2])
                        && (grid[i][j] + grid[i + 1][j] + grid[i + 2][j]) == (grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2])
                        && (grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2]) == (grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j])
                )
                    count++;
        return count;
    }
}
