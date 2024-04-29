import java.util.Collections;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public static int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollLast();
            }
        }
        if (set.size() < 3)
            return set.first();
        else
            return set.last();


    }
}