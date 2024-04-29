// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(1241243124));
    }
    public static int mySqrt(int x) {
        if (x == 0) return 0;

        int start = 1;
        int last = x;

        while (start <= last) {
            int mid = (last + start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
//        return (int) Math.sqrt(x);
    }

}