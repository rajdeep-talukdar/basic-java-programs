import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("enter the third number: ");
        int num3 = in.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println(max + " is the greatest");

        in.close();
    }
}
