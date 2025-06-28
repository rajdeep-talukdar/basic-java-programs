import java.util.Scanner;

public class minElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length of array: ");
        int n = in.nextInt();

        System.out.print("enter elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum element: " + min);
    }
}
