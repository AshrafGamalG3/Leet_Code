import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int [][]arr={{1,2},{3,5},{6,7},{8,10},{12,16}};
//        int []a={4,8};
        int [][]arr={{1,3},{6,9}};
        int []a={2,5};
        System.out.println(insert(arr,a));

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i=0;
            while (i<intervals.length&&intervals[i][0]<newInterval[0]&&intervals[i][1]<newInterval[0]){
                    result.add(intervals[i]);
                i++;
            }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        result.add(newInterval);

        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        int[][] resArray = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            resArray[j] = result.get(j);
            System.out.println(Arrays.toString(resArray[j]));
        }

        return resArray;

    }
}