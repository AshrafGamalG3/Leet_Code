import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] n1={1,2,3};
        int [] n2={2,4};
        System.out.println(getCommon(n1,n2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        List<Integer> commonElements = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num) && !commonElements.contains(num)) {
                commonElements.add(num);
            }
        }
        if (commonElements.isEmpty())
            return -1;
        for (int c:commonElements){
            min=Math.min(min,c);
        }
        System.out.println(commonElements);
    return min;
    }
}