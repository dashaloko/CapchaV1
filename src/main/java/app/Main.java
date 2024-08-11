package app;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter your number(s)");
        input = scanner.nextLine();

        if (isValidNumber(input)) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (char c : input.toCharArray()) {
                numbers.add(Character.getNumericValue(c));
            }
            System.out.println("Your number(s)" + numbers);

            for (int number : numbers) {
                switch (number) {
                    case 0:
                        Pattern.printNumberZero();
                        break;
                    case 1:
                        Pattern.printNumberOne();
                        break;
                    case 2:
                        Pattern.printNumberTwo();
                        break;
                    case 3:
                        Pattern.printNumberThree();
                        break;
                    case 4:
                        Pattern.printNumberFour();
                        break;
                    case 5:
                        Pattern.printNumberFive();
                        break;
                    case 6:
                        Pattern.printNumberSix();
                        break;
                    case 7:
                        Pattern.printNumberSeven();
                        break;
                    case 8:
                        Pattern.printNumberEight();
                        break;
                    case 9:
                        Pattern.printNumberNine();
                        break;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input. Please enter only digits.");
        }
    }

    private static boolean isValidNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                return false;
        }
        {
            return true;
        }

    }

}