// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0)
            n /= 3;
        return n == 1;
    }
}