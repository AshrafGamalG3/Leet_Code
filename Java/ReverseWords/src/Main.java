import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {

        String[] arr = s.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);

        List<String> list1 = new ArrayList<>();
        for (String word : list) {
            if (!word.equals("")) {
                list1.add(word);
            }
        }
        return String.join(" ", list1);

    }
}