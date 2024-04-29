// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public boolean isMatch(String s, String p) {
        int c = 0;
        int v = 0;
        char[] arr = p.toCharArray();
        for (char x : arr) {
            if (x == '*')
                c++;
            else if (x == '?')
                v++;
        }
        if (p.contains(s))
            return true;
        if (c >= 1) {
            if (p.length() < s.length())
                return true;
        }

        return false;
    }
}