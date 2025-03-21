
import java.util.Scanner;
class spiralMatrix {
    public static void main(String args[]) {
        System.out.println("Enter the row:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

        while (num <= n * n) {
            // → Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // ↓ Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // ← Right to Left
            if (top <= bottom) { 
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // ↑ Bottom to Top
            if (left <= right) { 
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // ✅ Print the Spiral Matrix
        System.out.println("\nSpiral Pattern:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

