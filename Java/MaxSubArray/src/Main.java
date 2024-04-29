import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] src = new int[] {1, 2, 3, 4, 5};
        int b1[] = Arrays.copyOfRange(src, 0, 4);
        System.out.println(Arrays.toString(b1));
    }

    public int maxProduct(String[] words) {

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                set.add(c);
            }
            for (int j = i + 1; j < words.length; j++) {
                boolean hasCommonLetters = false;
                for (char c : words[j].toCharArray()) {
                    if (set.contains(c)) {
                        hasCommonLetters = true;
                        break;
                    }
                }

                if (!hasCommonLetters) {
                    int product = words[i].length() * words[j].length();
                    max = Math.max(max, product);
                }
            }
        }

        return max;
        }




}