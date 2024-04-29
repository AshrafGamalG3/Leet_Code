// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public static String shortestPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverse = stringBuilder.reverse().toString();
        stringBuilder.insert(0, reverse);
        int x = stringBuilder.length();
        int y = x - s.length();
        for (int i = 0; i < s.length(); i++)
            if (s.substring(0, s.length() - i).equals(reverse.substring(i)))
                return stringBuilder.substring(0, i + s.length());
        return s;
    }
}