import java.util.Scanner;

public class arrayInputReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("enter elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("reversed array: ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
