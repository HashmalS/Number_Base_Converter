import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSting = scanner.nextLine();
        String[] splitString = inputSting.split("\\s");

        BigInteger a = new BigInteger(splitString[0]);
        BigInteger b = new BigInteger(splitString[1]);
        BigInteger c = new BigInteger(splitString[2]);
        BigInteger d = new BigInteger(splitString[3]);

        BigInteger result = BigInteger.ZERO.subtract(a).multiply(b).add(c).subtract(d);
        System.out.println(result);
    }
}