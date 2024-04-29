// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public int findJudge(int n, int[][] trust) {
        int[] x = new int[n + 1];
        int[] y = new int[n + 1];

        for (int[] pair : trust) {
            int a = pair[0];
            int b = pair[1];
            y[a]++;
            x[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (x[i] == n - 1 && y[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}