import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] n1={1,2,2,1};
        int [] n2={2,2};
        System.out.println(intersection(n1,n2));
    }
    public static   int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        Set<Integer> commonElements = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num) ) {
                commonElements.add(num);
            }
        }
        int [] a=commonElements.stream().mapToInt(Integer::intValue).toArray();


        System.out.println(Arrays.toString(a));
        return a;
    }
}