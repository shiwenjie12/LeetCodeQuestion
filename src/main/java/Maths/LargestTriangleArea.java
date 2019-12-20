package Maths;

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        double area = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    area = (points[i][0] * points[j][1] +
                            points[k][1] * points[j][0] +
                            points[k][0] * points[i][1] -
                            points[i][0] * points[k][1] -
                            points[j][0] * points[i][1] -
                            points[k][0] * points[j][1]) * 0.5;
                    maxArea = Math.max(Math.abs(area), maxArea);
                }
            }
        }
        return maxArea;
    }

    public double largestTriangleArea1(int[][] points) {
        double area = 0;
        double maxArea = 0;
        for (int i = 0; i < points.length; i++)
            for (int j = i + 1; j < points.length; j++)
                for (int k = j + 1; k < points.length; k++) {
                    area = (points[i][0] * points[j][1] +
                            points[k][1] * points[j][0] +
                            points[k][0] * points[i][1] -
                            points[i][0] * points[k][1] -
                            points[j][0] * points[i][1] -
                            points[k][0] * points[j][1]) * 0.5;
                    if (Math.abs(area) > maxArea) maxArea = Math.abs(area);
                }
        return maxArea;
    }
}
