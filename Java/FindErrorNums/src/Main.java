import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int[] findErrorNums(int[] nums) {
        int x = 0;
        int n = nums.length;
        int s = (n * (n + 1)) / 2;
        int[] arr = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            x = x + num;
            if (set.contains(num))
                arr[0] = num;

            set.add(num);
        }
        arr[1] = arr[0] + (s - x);

        return arr;
    }
}