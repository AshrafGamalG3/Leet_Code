// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public boolean isSubsequence(String s, String t) {
        int o = 0, p = 0;

        while (o < s.length() && p < t.length()) {
            if (s.charAt(o) == t.charAt(p)) {
                o++;
            }
            p++;
        }

        return o == s.length();
    }
}