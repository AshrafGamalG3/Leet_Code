// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(pivotInteger(1));
    }
    public static int pivotInteger(int n) {
        int sum =  n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int left =  i * (i + 1) / 2;
            long right = sum - left + i;
            if (left == right) {
                return i;
            }
        }
//        int sum = n*(n+1)/2;
//        int pivot = (int)Math.sqrt(sum);
//        if(pivot*pivot==sum) return pivot;
//        else return -1;
        return -1;
    }
}