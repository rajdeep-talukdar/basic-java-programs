import java.util.Scanner;

public class sumOfCol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("rows: ");
        int row = in.nextInt();

        System.out.print("cols: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("enter elements: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int colSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                colSum += arr[j][i];
            }
            if (colSum > maxSum) {
                maxSum = colSum;
            }

            System.out.println("sum of row " + i + ": " + colSum);
        }

        System.out.println("max sum is: " + maxSum);
    }
}
