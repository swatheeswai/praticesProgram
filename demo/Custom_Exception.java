import java.util.Scanner;

class InvalidException extends Exception {
    public InvalidException(String s) {
        super(s);
    }
}

class Custom_Exception {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            if (age < 18) {
                throw new InvalidException("Your age is below 18");
            }

            System.out.println("Your age is: " + age);
            scan.close();
                   }
                    catch (InvalidException e) {
            System.out.println(e.getMessage()); 
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

