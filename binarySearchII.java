import java.util.Scanner;

public class binarySearchII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("length of array: ");
        int n = in.nextInt();

        System.out.print("elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("target: ");
        int target = in.nextInt();

        System.out.println("element found at index: " + binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
