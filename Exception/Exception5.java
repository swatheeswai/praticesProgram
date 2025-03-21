import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception5 {

    // Method to check if a file is empty and read its contents
    public static void checkFileEmpty(String fileName) throws FileNotFoundException, IllegalStateException {
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            throw new FileNotFoundException("The file does not exist.");
        }

        // Open the file with Scanner
        Scanner scanner = new Scanner(file);

        // Check if the file is empty
        if (!scanner.hasNext()) {
            scanner.close();
            throw new IllegalStateException("The file is empty.");
        }

        // If the file is not empty, you can read its contents
        System.out.println("File content:");
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        // Close the scanner after reading the file
        scanner.close();
    }

    public static void main(String[] args) {
        // Provide the path to the file
        String fileName = "emptyfile.txt"; // Replace with the actual file path

        try {
            // Calling the method to check for file emptiness and read content
            checkFileEmpty(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

