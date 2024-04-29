// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
    if (n==1)
        return true;
       else if(n%2==1||n==0)
            return false;

        return isPowerOfTwo(n/2);
    }
}