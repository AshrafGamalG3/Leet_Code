// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int tmp = 0;
                if (heights[i] < heights[j]) {
                    String s = names[i];
                    names[i] = names[j];
                    names[j] = s;
                    tmp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tmp;
                }
            }
        }

        return names;
    }
}