import java.math.BigInteger;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger().negate();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        System.out.println(a.multiply(b).add(c).subtract(d));


    }
}
