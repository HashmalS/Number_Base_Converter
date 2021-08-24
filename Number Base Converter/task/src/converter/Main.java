package converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int sourceBase;
    private static int targetBase;
    private static final char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) {
        scanner.useLocale(Locale.US);
        boolean nextOperation = true;
        String currentCommand;
        String[] splitValues;

        do {
            System.out.print("Enter two numbers in format {source base} {target base} (To quit type /exit) " );
            currentCommand = scanner.nextLine();
            if (currentCommand.equals("/exit")) {
                nextOperation = false;
            } else {
                splitValues = currentCommand.split("\\s");
                sourceBase = Integer.parseInt(splitValues[0]);
                targetBase = Integer.parseInt(splitValues[1]);
                ConvertMain();
            }
        } while (nextOperation);
    }

    public static void ConvertMain() {
        while (true) {
            System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) ",
                    sourceBase, targetBase);
            String command = scanner.nextLine();
            String[] splitCommand = command.split("\\.");
            String integer = splitCommand[0];
            String fractional = "";
            if (splitCommand.length > 1) {
                fractional = splitCommand[1];
            }
            if (command.equals("/back")) {
                return;
            }
            BigInteger decimalIntegerValue;
            BigDecimal decimalFractionalValue;

            if (sourceBase == 10) {
                if (fractional.equals("")) {
                    System.out.println("Conversion result: " + ConvertIntegerFromDex(new BigInteger(integer)));
                } else {
                    System.out.println("Conversion result: " +
                            ConvertIntegerFromDex(new BigInteger(integer)) + "." +
                            ConvertFractionalFromDex(new BigDecimal("0.".concat(fractional))));
                }
            } else {
                decimalIntegerValue = ConvertIntegerToDex(integer.toUpperCase());
                decimalFractionalValue = ConvertFractionalToDex(fractional.toUpperCase());
                if (targetBase == 10) {
                    if (fractional.equals("")) {
                        System.out.println("Conversion result: " + decimalIntegerValue);
                    } else {
                        System.out.println("Conversion result: " +
                                decimalFractionalValue.add(new BigDecimal(decimalIntegerValue)));
                    }
                } else {
                    if (fractional.equals("")) {
                        System.out.println("Conversion result: " + ConvertIntegerFromDex(decimalIntegerValue));
                    } else {
                        System.out.println("Conversion result: " +
                                ConvertIntegerFromDex(decimalIntegerValue) + "." +
                                ConvertFractionalFromDex(decimalFractionalValue));
                    }
                }
            }
        }
    }

    public static BigInteger ConvertIntegerToDex(String value) {
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < hexValues.length; j++) {
                if (value.charAt(i) == hexValues[j]) {
                    result = result.add(BigInteger
                            .valueOf((long) ((long) j * Math.pow(sourceBase, value.length() - i - 1))));
                }
            }
        }

        return result;
    }

    public static String ConvertIntegerFromDex(BigInteger value) {
        String result = "";
        do {
            char hexValue = hexValues[value.mod(BigInteger.valueOf(targetBase)).intValue()];
            result = result.concat(String.valueOf(hexValue));
            value = value.divide(BigInteger.valueOf(targetBase));
        } while (value.compareTo(BigInteger.ONE) > 0);

        if (value.compareTo(BigInteger.ZERO) != 0) result = result.concat(String.valueOf(value));

        return new StringBuilder(result).reverse().toString();
    }

    public static BigDecimal ConvertFractionalToDex(String value) {
        BigDecimal result = BigDecimal.ZERO;
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < hexValues.length; j++) {
                if (value.charAt(i) == hexValues[j]) {
                    result = result.add(BigDecimal.valueOf(j * Math.pow(sourceBase, -(i + 1))));
                }
            }
        }
        return result.setScale(5, RoundingMode.HALF_UP);
    }

    public static String ConvertFractionalFromDex(BigDecimal value) {
        String result = "";
        int i = 0;
        while (!value.equals(BigDecimal.ZERO) && i < 5) {
            value = value.multiply(BigDecimal.valueOf(targetBase));
            result = result.concat(String.valueOf(hexValues[value.intValue()]));
            value = value.subtract(BigDecimal.valueOf(value.intValue()));
            i++;
        }
        return result;
    }
}
