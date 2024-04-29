// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int numSquares(int n) {
        int x = 0;

        for (int i = n; i >= 0; i++) {
            if (isPerfect(i)) {
                n = n - i;
                x++;
            }
        }
        return x;
    }

    boolean isPerfect(int i) {
        double sq = Math.sqrt(i);
        return sq == Math.floor(sq);
    }
}