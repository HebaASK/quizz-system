/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quizz.system;


//import com.mycompany.mavenproject10.QuizInterface;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizSystem implements QuizInterface {
    private final ArrayList<String> questions = new ArrayList<>();
    private final ArrayList<String> correctAnswers = new ArrayList<>();

    @Override
    public void showWelcome() {
        System.out.println("*************************************");
        System.out.println("   Welcome to Quiz Program    ");
        System.out.println("*************************************");
        System.out.println("This program allows you to create and take quizzes on various subjects.");
        System.out.println("You can define your own questions, select subjects, and track your progress.");
        System.out.println("Let's get started!");
        System.out.println("*************************************");
    }

    @Override
    public void showInstructions() {
        System.out.println("Instructions:");
        System.out.println("1. You can introduce yourself with username and password.");
        System.out.println("2. You can create your own quiz by adding questions.");
        System.out.println("3. You can choose a subject to take a quiz.");
        System.out.println("4. After taking the quiz, your performance will be evaluated.");
        System.out.println("5. Enjoy learning and have fun!");
        System.out.println("*************************************");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("*************************************");
        System.out.println("Thank you for using the Quiz Program!");
        System.out.println("Goodbye, and keep exploring your knowledge!");
        System.out.println("*************************************");
    }

    @Override
    public void addQuestion(String question, String answer) {
        questions.add(question);
        correctAnswers.add(answer);
        System.out.println("Question added successfully!");
    }

    @Override
    public void editQuestion(int index, String question, String answer) {
        if (index >= 0 && index < questions.size()) {
            questions.set(index, question);
            correctAnswers.set(index, answer);
            System.out.println("Question updated successfully!");
        } else {
            System.out.println("Invalid question index!");
        }
    }

    @Override
    public void deleteQuestion(int index) {
        if (index >= 0 && index < questions.size()) {
            questions.remove(index);
            correctAnswers.remove(index);
            System.out.println("Question deleted successfully!");
        } else {
            System.out.println("Invalid question index!");
        }
    }

    @Override
    public void startQuiz() {
        Scanner input = new Scanner(System.in);
        int score = 0;

        if (questions.size() != correctAnswers.size()) {
            System.out.println("Error: Mismatch between questions and answers!");
            return;
        }

        System.out.println("\n--- Quiz Start ---");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions.get(i));
            System.out.print("Your answer (A/B/C/D): ");
            String answer = input.nextLine().toUpperCase();

            if (answer.equals(correctAnswers.get(i))) {
                System.out.println("Correct! 🎉");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + correctAnswers.get(i) + ".");
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your final score: " + score + "/" + questions.size());
    }

    @Override
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
