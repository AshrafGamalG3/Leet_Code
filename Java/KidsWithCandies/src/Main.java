import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();

        int m = Integer.MIN_VALUE;
        for (int candy : candies) {
            m = Math.max(m, candy);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= m) {
                l.add(true);
            } else {
                l.add(false);
            }
        }
        return l;
    }
}