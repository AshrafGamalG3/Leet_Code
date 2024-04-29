import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int max = 0;
        int most = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ke = entry.getValue();
            int val = entry.getKey();
            if (ke > max || ke == max && val < most) {
                max = ke;
                most = val;
            }
        }
        return most;
    }
}