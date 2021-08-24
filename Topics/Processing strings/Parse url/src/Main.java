import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Map<String, String> urlMap = new LinkedHashMap<>();
        Scanner inputScanner = new Scanner(System.in);
        String fullAddress = inputScanner.nextLine();
        String[] splitAddress = fullAddress.split("[:/?&]");

        String[] tempArray;
        boolean containsPass = false;
        String passValue = "";

        for (String partOfAddress :
             splitAddress) {
            if (partOfAddress.contains("=")) {
                tempArray = partOfAddress.split("=");
                if (tempArray[0].equals("pass")) {
                    containsPass = true;
                    passValue = tempArray[1];
                }
                urlMap.put(tempArray[0], tempArray.length > 1 ? tempArray[1] : "not found");
            }
        }

        if (containsPass) {
            urlMap.put("password", passValue);
        }

        urlMap.forEach((k, v) -> System.out.printf("%s : %s\n", k, v));
    }
}