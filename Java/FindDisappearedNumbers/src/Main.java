import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int []nums={4,3,2,7,8,2,3,1};
        int []nums={1,1};
        System.out.println((findDisappearedNumbers(nums)));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();


        for (int num : nums) {

            hashSet.add(num);
        }

        List<Integer> list = new ArrayList<>();



        for (int i = 1; i <= nums.length; i++) {
            if (!hashSet.contains(i)) {
                list.add(i);
            }
        }

        return list;

    }
}