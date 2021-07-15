import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger b = BigInteger.ONE;
        for (int i = n; i > 1; i = i - 2) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        return b;
    }
}
