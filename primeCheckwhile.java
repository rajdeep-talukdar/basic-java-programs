import java.util.Scanner;

public class primeCheckwhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        if (num <= 1) {
            System.out.println("not a prime a number");
            return;
        }
        int i = 2;
        while (i*i <= num) {
            if (num % i == 0) {
                System.out.print("not a prime number");
                return;
            }
            i++;
        }
        System.out.println("prime number");
    }
}
