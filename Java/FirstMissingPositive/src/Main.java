import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int []nums={7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        HashSet <Integer> hashSet=new HashSet<>();
        boolean flag=false;
        int max=0;
        for (int num:nums){
            max=Math.max(max,num);
            hashSet.add(num);
        }

        List<Integer> list=new ArrayList<>();

        for (int i=1;i<=max;i++){
            if (hashSet.contains(i)){
                flag=true;
                continue;
            }else if (!hashSet.contains(i)){
                return i;
            }
        }
        if (flag)
            return max+1;


return max+1;
    }
}