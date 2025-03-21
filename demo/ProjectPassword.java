import java.util.Scanner;

class Password {
    private String password;

    // Constructor
    public Password(String password) {
        this.password = password;
    }

    // Validation method
    public boolean validate() {
        if (password.length() < 8) {
            return false;
        }

        boolean hasSpecialChar = false;
        boolean hasNumber = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if ("!@#$%^&*()_+{}[]?<>|".contains(Character.toString(ch))) {
                hasSpecialChar = true;
            }
        }

        return hasSpecialChar && hasNumber && hasUpperCase && hasLowerCase;
    }
}

class ProjectPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n* One UpperCase must be present" +
                           "\n* One LowerCase must be present" +
                           "\n* One Special Character must be present " +
                           "\n* One Digit must be present" +
                           "\n* Your password must be at least 8 characters long");
        System.out.println("=================================");
        
        System.out.println("Enter password:");
        String inputPassword = scan.next();
        
        Password password = new Password(inputPassword); // Create an instance of Password
        boolean valid = password.validate(); // Validate the password
        
        if (valid) {
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Please provide a valid password.");
        }

        scan.close(); // Close the scanner
    }
}

