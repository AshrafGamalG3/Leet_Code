import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int []nums={0,1};
        System.out.println(findMaxLength(nums));

    }
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;

            if (countMap.containsKey(count)) {
                maxLen = Math.max(maxLen, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }
        return maxLen;
    }
}