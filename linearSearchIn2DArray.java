import java.util.Arrays;
import java.util.Scanner;

public class linearSearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("rows: ");
        int row = in.nextInt();

        System.out.print("col: ");
        int col = in.nextInt();

        System.out.println("elements: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print("target element: ");
        int target = in.nextInt();

        int[] result = search(arr, target);
        if (result[0] == -1) {
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at: " + Arrays.toString(result));
        }


    }
    static int[] search(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols] == target) {
                    return new int[] {rows, cols};
                }
            }
        }
        return new int[] {-1, -1};
    }
}


