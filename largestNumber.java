import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int a = in.nextInt();

        System.out.print("enter the second number: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println(b + " is greater than " + a);
        }
        in.close();
    }
}
