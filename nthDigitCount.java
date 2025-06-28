import java.util.Scanner;

public class nthDigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = in.nextInt();

        System.out.print("enter the digit you want to count: ");
        int countNum = in.nextInt();

        if (countNum <= 0 || countNum > 9) {
            System.out.print("please enter a valid digit");
            return;
        }
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == countNum) {
                count ++;
            }
            num = num / 10;
        }
        System.out.print("digit " + countNum + " occurs " + count + " time(s)");
    }
}
