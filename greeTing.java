import java.util.Scanner;

public class greeTing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("hello " + name + ", how you doing?");
        in.close();
    }

}
