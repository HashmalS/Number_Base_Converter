import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        int parity = n % 2;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == parity) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }

        return result;
    }
}