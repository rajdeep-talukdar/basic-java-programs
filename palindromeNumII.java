import java.util.Scanner;

public class palindromeNumII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int rev = num % 10;
            sum = sum * 10 + rev;
            num /= 10;
        }

        return originalNum == sum;

    }
}
