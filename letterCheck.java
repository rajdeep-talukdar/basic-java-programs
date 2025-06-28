import java.util.Scanner;

public class letterCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a letter: ");
        char ch = in.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("is's lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("it's uppercase");
        }
        else {
            System.out.println("it's not a letter");
        }
    }
}
