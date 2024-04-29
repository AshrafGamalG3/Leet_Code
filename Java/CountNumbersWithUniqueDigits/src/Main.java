// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int countNumbersWithUniqueDigits(int n) {
        int count = 10;
        int x = 9;
        int y = 9;
        if (n == 0) {
            return 1;
        }
        for (int i = 2; i <= n && y > 0; i++) {
            x *= y;
            count += x;
            y--;
        }


        return count;
    }
}