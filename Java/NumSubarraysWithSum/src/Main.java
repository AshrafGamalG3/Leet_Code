import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int [] nums = {1,0,1,0,1};
               int g=2;
        System.out.println(numSubarraysWithSum(nums,g));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=0;
        int count=0;

        for (int num:nums){
         curr+=num;
         if (curr==goal)
             count++;
         count+=map.getOrDefault(curr-goal,0);
         map.put(curr,map.getOrDefault(curr,0)+1);

        }
        System.out.println(map);
        return count;
    }
}