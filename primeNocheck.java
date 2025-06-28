import java.util.Scanner;

public class primeNocheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i*i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
