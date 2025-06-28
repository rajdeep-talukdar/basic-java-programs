import java.util.Scanner;

public class searchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the word: ");
        String word = in.next();

        System.out.print("target letter: ");
        char target = in.next().charAt(0);

        System.out.println(search(word, target));
    }
    static boolean search(String word, char target) {
        if(word.isEmpty()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
