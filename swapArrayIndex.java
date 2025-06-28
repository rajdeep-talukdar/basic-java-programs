import java.util.Arrays;
import java.util.Scanner;

public class swapArrayIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
