// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        if (n == 1) return 1;
        int ze = 0;
        int on = 1;
        int f = 0;
        for (int i = 2; i <= n; i++) {
            f = ze + on;
            ze = on;
            on = f;
        }
        return f;
    }

}