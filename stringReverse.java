import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the word: ");
        String name = in.next();
        String reverse = "";

        for (int i = 0; i < name.length(); i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.print("reverse word is: " + reverse);
    }
}
