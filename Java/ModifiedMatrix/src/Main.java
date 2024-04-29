import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [][] arr={{1,2,-1},{4,-1,6},{7,8,9}};
        System.out.println(modifiedMatrix(arr));
    }
    public static int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxValueInColumn(matrix, j);
                }
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    private static int maxValueInColumn(int[][] matrix, int col) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(max, matrix[i][col]);
        }
        return max;
    }
}