import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You an now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            System.out.println(mapS.get(charS));
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                if (mapT.containsKey(charT)) {
                    return false;
                }
                mapS.put(charS, charT);
                mapT.put(charT, charS);
            }
        }

        return true;
    }
}