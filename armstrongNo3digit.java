import java.util.Scanner;

public class armstrongNo3digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        int original = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num /= 10;
        }
        if (sum == original) {
            System.out.println("armstrong number");
            return;
        }
        else {
            System.out.println("not an armstrong number");
        }
    }
}
