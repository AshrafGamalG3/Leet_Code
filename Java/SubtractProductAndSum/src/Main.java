// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int x = 1;
        while (n > 0) {
            int v = n % 10;
            sum += v;
            x *= v;
            n = n / 10;
        }

        return x - sum;
    }
}