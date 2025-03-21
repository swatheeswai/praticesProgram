import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception4{

    // Method that reads numbers from the file and checks for positive numbers
    public static void readNumbersFromFile(String fileName) throws FileNotFoundException, IllegalArgumentException {
        File file = new File(fileName);
        
        // Try to open the file using Scanner
        Scanner scanner = new Scanner(file);

        // Iterate over the numbers in the file
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                
                // Check if the number is positive
                if (number > 0) {
                    // Throw an exception if the number is positive
                    throw new IllegalArgumentException("Positive number found: " + number);
                }
            } else {
                // Skip non-integer values if any (this can be customized)
                scanner.next();  // Skip non-integer values
            }
        }

        // Close the scanner after reading the file
        scanner.close();
    }

    public static void main(String[] args) {
        // File name to read from
        String fileName = "numbers.txt";  // Replace with the actual file name

        try {
            // Calling the readNumbersFromFile method
            readNumbersFromFile(fileName);
            System.out.println("No positive numbers found in the file.");
        } catch (FileNotFoundException e) {
            // Handle case when file is not found
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IllegalArgumentException e) {
            // Handle case when a positive number is found
            System.out.println("Error: " + e.getMessage());
        }
    }
}

