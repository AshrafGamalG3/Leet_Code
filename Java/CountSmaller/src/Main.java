import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    x++;
                }

            }
            list.add(x);
            x = 0;
        }
        return list;
    }
}