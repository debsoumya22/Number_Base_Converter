import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        BigDecimal c = sc.nextBigDecimal();

        System.out.println(a.add(b).add(c).divide(new BigDecimal("3"), 0, RoundingMode.DOWN));
    }
}
