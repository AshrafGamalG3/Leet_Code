// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        if (n <= 3)
            return n;
        int s2 = 2;
        int s3 = 3;
        for (int i = 4; i <= n; i++) {
            int sum = s2 + s3;
            s2 = s3;
            s3 = sum;
        }
        return s3;
    }
}