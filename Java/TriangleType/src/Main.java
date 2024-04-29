import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    }
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0];
        int y = nums[1];
        int z = nums[2];
        if (x + y <= z)
            return "none";
        else if (x == y && y == z)
            return "equilateral";
        else if (x == y || y == z)
            return "isosceles";


        return "scalene";
    }
}