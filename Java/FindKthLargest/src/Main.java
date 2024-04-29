import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        if (k <= 0 || k > nums.length) {
            return 0;
        }
        return nums[nums.length - k];
    }
}