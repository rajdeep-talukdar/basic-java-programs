import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = in.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int rev = num % 10;
            sum = sum * 10 + rev;
            num /= 10;
        }
        if (originalNum == sum) {
            System.out.println("it's palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }

}
