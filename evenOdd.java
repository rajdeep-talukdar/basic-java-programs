import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("it's an even number");
        }
        else {
            System.out.println("it's an odd number");
        }
        in.close();
    }
}
