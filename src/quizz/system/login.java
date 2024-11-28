
package quizz.system;

import java.util.Scanner;

class Login {
        public void loginUser() {
            Scanner scanner = new Scanner(System.in);

            
            System.out.println("\n--- Login Page ---");
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

           
            System.out.println("Select Role: ");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.print("Enter your choice (1 or 2): ");
            int roleChoice = scanner.nextInt();

            
            if (roleChoice == 1) {
                System.out.println("\nWelcome, Teacher " + username + "!");
            } else if (roleChoice == 2) {
                System.out.println("\nWelcome, Student " + username + "!");
            } else {
                System.out.println("\nInvalid role choice. Please restart the program.");
            }
        }
    }
