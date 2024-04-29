// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        return isSq(n, dp);
    }

    public static boolean isSq(int n, boolean[] dp) {
        if (n == 0) {
            return false;
        }

        if (dp[n]) {
            return true;
        }

        for (int i = 1; i * i <= n; i++) {
            if (!isSq(n - i * i, dp)) {
                dp[n] = true;
                return true;
            }
        }

        return false;
    }
}