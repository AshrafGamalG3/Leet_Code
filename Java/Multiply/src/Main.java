import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    public String multiply(String num1, String num2) {

        BigDecimal x = new BigDecimal(num1);
        BigDecimal y = new BigDecimal(num2);
        return String.valueOf(x.multiply(y));

    }

}