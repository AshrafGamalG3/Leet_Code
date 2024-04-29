import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] nums={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(nums));
    }

    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(points));

            int end=points[0][1];
            int count=0;
            for (int i=1;i<points.length;i++){
                if (points[i][0]>end){
                    count++;
                    end=points[i][1];
                }
            }
        return ++count;
    }
}