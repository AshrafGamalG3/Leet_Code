// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
    public static boolean isPowerOfFour(int n) {
        //   if (n <= 0) {
        //         return false;
        //     }
        //     while (n%4==0){
        //         n=n/4;
        //     }
        //     return n==1;

        if(n==1)return true;
        else if(n%4!=0 || n==0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}