import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        String[] splitString = inputString.split("\\s+");

        String dataString = splitString[0];
        int subsequenceLength = Integer.parseInt(splitString[1]);

        String result = subsequenceLength > dataString.length() ? dataString :
                dataString.substring(subsequenceLength) + dataString.substring(0, subsequenceLength);
        System.out.println(result);
    }
}