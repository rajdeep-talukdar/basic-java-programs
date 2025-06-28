import java.util.Scanner;

public class arithmeticCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        while (true) {
            System.out.print("enter the first no: ");
            int num1 = in.nextInt();

            System.out.print("enter the second no: ");
            int num2 = in.nextInt();

            System.out.print("enter '+' '-' '*' '/' for calculation: ");
            char operator = in.next().charAt(0);

            String message = "your answer is: ";
            if (operator == '+') {
                System.out.println(message + (num1 + num2));
            }
            else if (operator == '-') {
                System.out.println(message + (num1 - num2));
            }
            else if (operator == '*') {
                System.out.println(message + (num1 * num2));
            }
            else if (operator == '/') {
                if (num2 != 0) {
                    System.out.println(message + (num1 / num2));
                }
                else {
                    System.out.print("division by zero is not possible");
                }
            }
            else {
                System.out.println("invalid operator");
            }
            System.out.println("press 'y' to continue again, 'n' to exit: ");
            char repeat = in.next().charAt(0);
            if (Character.toLowerCase(repeat) == 'y') {
                continue;
            }
            else if (Character.toLowerCase(repeat) == 'n') {
                System.out.println("exiting...");
                break;
            }
            else {
                System.out.println("error!, exiting...");
                break;
            }
        }

    }
}