import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();


        Map<String, String> map = new HashMap<>();
        for (String word : words) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if (!map.containsKey(s)) {
                map.put(s, word);
                list.add(word);
            }
        }

        return list;

    }
}