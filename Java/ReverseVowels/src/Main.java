// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public String reverseVowels(String s) {
        char[] x = s.toCharArray();
        int i = 0;
        int j = s.length();
        while (i < j) {
            if (isVowel(x[i])) {
                if (isVowel(x[j])) {
                    char temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return new String(x);

    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}