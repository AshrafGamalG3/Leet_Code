import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums1)
            list.add(n);
        for (int n : nums2)
            list.add(n);
        int x = list.size();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);

        if (x % 2 == 1) {
            int y = (x / 2) - 1;

            return arr[y];
        } else {
            int y = (x / 2);

            double v = arr[y];
            double c = arr[--y];
            return (v + c) / 2;

        }


    }
}