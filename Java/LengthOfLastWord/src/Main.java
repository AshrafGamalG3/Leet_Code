// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello world"));
    }
    public static int lengthOfLastWord(String s) {
        String v = s.trim();
        int l = 0;
        for (int i = v.length()-1; i >= 0; i--) {
            l++;
            if (v.charAt(i) == ' ') {
                break;
            }

        }

        return l;
    }
}