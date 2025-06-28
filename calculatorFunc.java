import java.util.Scanner;

public class calculatorFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("enter '+' '-' '*' '/': ");
        char operator = in.next().charAt(0);

        calculator(num1, num2, operator);
        in.close();
    }
    static void calculator(int num1, int num2, char operator) {
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
                System.out.println("division by zero not possible");
            }
        }
        else {
            System.out.println("invalid choice");
        }
    }
}
