import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BigInteger value = new Scanner(System.in).nextBigInteger();
        BigInteger fact = BigInteger.ONE;
        int count = 1;
        while (fact.compareTo(value) < 0) {
            fact = fact.multiply(BigInteger.valueOf(++count));
        }
        System.out.println(count);
    }
}
