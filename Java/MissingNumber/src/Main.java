// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int s = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sum = sum + nums[i];
        }
        return s - sum;
    }
}