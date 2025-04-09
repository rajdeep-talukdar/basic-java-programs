import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("enter '+' for addition, '-' for subtraction, '/' for division and '*' for multiplication ");
        char operator = in.next().charAt(0);
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }
            else {
                System.out.print("division by zero is not possible!");
                return;
            }
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else {
            System.out.print("invalid option");
            return;
        }
        System.out.println("the result is: " + result);
        in.close();

    }
}
