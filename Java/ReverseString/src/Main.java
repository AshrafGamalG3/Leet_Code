// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        int x = s.length;
        char[] b = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            b[i] = s[x - 1];
            x--;
        }
        System.arraycopy(b, 0, s, 0, s.length);

    }
}
