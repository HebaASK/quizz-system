/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz.system;

import java.util.Scanner;


public class display {
   public void showWelcome(){
System.out.println("*************************************");
 System.out.println("   Welcome to Quiz Program    ");
 System.out.println("*************************************");
 System.out.println("This program allows you to create and take quizzes on various subjects.");
 System.out.println("You can define your own questions, select subjects, and track your progress.");
 System.out.println("Let's get started!");
 System.out.println("*************************************"); 
}
public void showInstructions() {

 System.out.println("Instructions:");
 System.out.println("1. You can introduce yourself with username and password.");
 System.out.println("2. You can create your own quiz by adding questions.");
 System.out.println("3. You can choose a subject to take a quiz.");
 System.out.println("4. After taking the quiz, your performance will be evaluated.");
 System.out.println("5. Enjoy learning and have fun!");
 System.out.println("*************************************");
 }

 public void sayGoodbye() {
System.out.println("*************************************");
 System.out.println("Thank you for using the Quiz Program!");
 System.out.println("Goodbye, and keep exploring your knowledge!");
 System.out.println("*************************************");
 }


}






class Login extends display{
        String username;
        String password ;
        public void loginUser() {
            Scanner scanner = new Scanner(System.in);

            
            System.out.println("\n--- Login Page ---");
            System.out.print("Enter Username: ");
            this.username = scanner.nextLine();
            

            System.out.print("Enter Password: ");
            this.password = scanner.nextLine();
            

           
            //System.out.println("Select Role: ");
            //System.out.println("1. Teacher");
            //System.out.println("2. Student");
            //System.out.print("Enter your choice (1 or 2): ");
            //int roleChoice = scanner.nextInt();       

}
        public void T() {
        System.out.println("******** Welcome Teacher  " + username +"  *******");
        
    }
        
        public void S() {
        System.out.println("********* Welcome Student   " + username + "   *******");
        
    }
            //if (roleChoice == 1) {
              //  System.out.println("\nWelcome, Teacher " + username + "!");
            //} else if (roleChoice == 2) {
                //System.out.println("\nWelcome, Student " + username + "!");
            //} else {
                //System.out.println("\nInvalid role choice. Please restart the program.");
           // }
        }
    

