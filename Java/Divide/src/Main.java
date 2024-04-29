// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int divide(int dividend, int divisor) {
        if (dividend == -Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        return dividend / divisor;
    }
}