// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       }
    public int search(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//        }
//        return -1;
        int s = 0;
        int l = nums.length - 1;
        while (s <= l) {
            int m = (s + l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                l = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}