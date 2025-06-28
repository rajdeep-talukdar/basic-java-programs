import java.util.Scanner;

public class palindromeStringII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the word: ");
        String word = in.next();
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String word) {

        String rev = "";
        for (int i = 0; i < word.length(); i++) {
            rev = word.charAt(i) + rev;
        }
        return word.equals(rev);
    }
}
