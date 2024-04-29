import java.util.Arrays;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int [][] nums={{1,2},{2,3},{3,4},{1,3}};
//        int [][] nums={{1,2},{1,2},{1,2}};
        int [][] nums={{1,2},{2,3}};

        System.out.println(eraseOverlapIntervals(nums));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < end) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }

        return count;
    }
}