import java.util.Scanner;

/**
 *
 * @author HP
 */
public class A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading T

        for (int t = 0; t < T; t++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String number = parts[0];
            String name = parts[1];

            String password = generatePassword(number, name);
            System.out.println(password);
        }
    }

    private static String generatePassword(String number, String name) {
        try {
            double num = Double.parseDouble(number);
            String scientificNotation = convertToScientificNotation(num);
            String S1 = getS1(scientificNotation);
            String S2 = getS2(scientificNotation, name);

            return S1 + "@" + S2;
        } catch (NumberFormatException e) {
            return "Invalid input";
        }
    }

    private static String convertToScientificNotation(double num) {
        String scientificNotation = String.format("%.1e", num);
        return scientificNotation;
    }

    private static String getS1(String scientificNotation) {
        String[] parts = scientificNotation.split("[eE]");
        String coefficient = parts[0].replace(".", ""); // Remove decimal point
        String exponent = parts[1];

        int sumCoefficient = 0;
        for (char digit : coefficient.toCharArray()) {
            sumCoefficient += Character.getNumericValue(digit);
        }
        int singleDigitCoefficient = sumCoefficient % 9 ; // Reduce to a single digit

        int singleDigitExponent = Integer.parseInt(exponent) % 9 ; // Reduce to a single digit

        return getWordRepresentation(singleDigitCoefficient) + "." + getWordRepresentation(singleDigitExponent);
    }

    private static String getS2(String scientificNotation, String name) {
        String[] parts = scientificNotation.split("[eE]");
        int singleDigitExponent = Integer.parseInt(parts[1]) % 9 ; // Reduce exponent to a single digit

        StringBuilder S2 = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if ((i + 1) % 2 == singleDigitExponent % 2) { // Odd position for odd exponent, even position for even exponent
                S2.append(name.charAt(i));
            }
        }

        return S2.toString();
    }

    private static String getWordRepresentation(int digit) {
        switch (digit) {
            case 0 -> {
                return "zere";
            }
            case 1 -> {
                return "one";
            }
            case 2 -> {
                return "two";
            }
            case 3 -> {
                return "thr";
            }
            case 4 -> {
                return "for";
            }
            case 5 -> {
                return "fiv";
            }
            case 6 -> {
                return "six";
            }
            case 7 -> {
                return "sev";
            }
            case 8 -> {
                return "eigh";
            }
            case 9 -> {
                return "nin";
            }
            default -> {
                return "";
            }
        }
    }
}
