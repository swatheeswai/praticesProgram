import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        scanner.close();
    }
}

