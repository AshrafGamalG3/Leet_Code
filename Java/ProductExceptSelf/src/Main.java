import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] arr=new int[nums.length];
        int j=0;

        int left = 1;
        for (int i=0;i<nums.length;i++){
               arr[i]=left;
               left*=nums[i];
        }

        int right = 1;
        for (int i=nums.length-1;i>=0;i--){
            arr[i]*=right;
            right*=nums[i];

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}