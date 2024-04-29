import java.util.HashMap;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int maxFrequencyElements(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        int maxF = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            set.add(num);
        }
        if (set.size() == nums.length) {
            return set.size();
        } else {
            for (int m : map.values()) {
                maxF = Math.max(maxF, m);

            }
        }
        int all = 0;
        for (int f : map.values()) {
            if (f == maxF) {
                all = all + maxF;
            }
        }
        return all;
    }
}