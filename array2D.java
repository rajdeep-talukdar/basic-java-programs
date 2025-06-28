import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = in.nextInt();
        System.out.print("col: ");
        int col = in.nextInt();
        int[][] arr = new int[rows][col];
        System.out.print("enter the numbers: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
