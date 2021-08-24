import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();

        String[] date = inputString.split("-");

        System.out.printf("%s/%s/%s\n", date[1], date[2], date[0]);
    }
}