import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] nums={1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {  Arrays.sort(nums);

        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] newArr = new int[nums.length];

        int i=0;
        int c=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();
            if (count>=2){
                newArr[i]=value;
                newArr[i+1]=value;
                c+=2;
                i+=2;
            }else if (count==1){
                newArr[i]=value;
                c+=1;
                i+=1;
            }
        }


        System.out.println(Arrays.toString(newArr));
        for (int i1=0;i1<newArr.length;i1++){

            nums[i1]=newArr[i1] ;
        }


        return c;
//        if (nums.length <= 2) {
//            return nums.length;
//        }
//
//        int count = 2;
//        for (int i = 2; i < nums.length; i++) {
//            if (nums[i] != nums[count - 2]) {
//                nums[count] = nums[i];
//                count++;
//            }
//        }
//
//        return count;
    }
}