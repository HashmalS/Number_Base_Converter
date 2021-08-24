import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();

        long n = 0L;
        BigInteger factN = BigInteger.ZERO;
        while (m.compareTo(factN) > 0) {
            factN = fact(++n);
        }

        System.out.println(n);
    }

    public static BigInteger fact(long value) {
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}