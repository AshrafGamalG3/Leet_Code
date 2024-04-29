// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int x = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[x++] = num;
            }
        }

        while (x < nums.length) {
            nums[x++] = 0;
        }
    }

}