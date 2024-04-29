import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      }
    public String removeStars(String s) {
        List<Character> v = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!v.isEmpty()) {
                    v.remove(v.size() - 1);
                }
            } else {
                v.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : v) {
            result.append(c);
        }
        return result.toString();
    }
}