import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        int originalNum = num;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count ++;
            num /= 10;
        }
        System.out.println("total digit in " + originalNum + " is: " + count);

    }
}
