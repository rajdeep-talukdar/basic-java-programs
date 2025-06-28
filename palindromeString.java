import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the word: ");
        String word = in.next();
        String rev = "";


        for (int i = 0; i < word.length(); i++) {
            rev = word.charAt(i) + rev;

        }
        if (word.equals(rev)) {
            System.out.println("it's palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}