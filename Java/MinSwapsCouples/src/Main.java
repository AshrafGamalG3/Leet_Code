// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int [] num={0,2,4,6,7,1,3,5};
        System.out.println(minSwapsCouples(num));
    }
    public static int minSwapsCouples(int[] row) {
        int count =0;

        for (int i=0 ;i<row.length;i+=2){
           int  j=i+1;
            if (row[j]-1!=row[i])
                count++;
        }

        return (int) Math.ceil(count/2);
    }
}