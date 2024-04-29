// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public static int reverse(int x) {

        int num = 0;
        while (x != 0) {
            int y = x % 10;
            num = num * 10 + y;
            x = x / 10;
        }

        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
            return 0;
        }


        return num;
    }
}