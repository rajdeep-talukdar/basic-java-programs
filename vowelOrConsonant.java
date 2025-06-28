import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a letter: ");
        char letter = in.next().charAt(0);
        letter = Character.toLowerCase(letter);

        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("it's a vowel");
            }
            else {
                System.out.println("it's consonant");
            }
        }

        else {
            System.out.println("not a letter");
        }
        in.close();
    }
}
