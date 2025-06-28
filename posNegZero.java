import java.util.Scanner;

public class posNegZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("it's positive");
        }
        else if (num < 0) {
            System.out.println("it's negative");
        }
        else {
            System.out.println("it's zero");
        }
        in.close();
    }
}
