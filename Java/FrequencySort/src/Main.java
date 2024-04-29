import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        char[] arr = s.toCharArray();
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (list.get(i) == arr[j]) {
                    r.append(list.get(i));
                }
            }
        }
        return r.toString();
    }
}