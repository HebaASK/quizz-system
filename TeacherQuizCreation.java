package quizz.system;

import java.util.Scanner;

public class TeacherQuizCreation extends Teacher {

    public void createNewQuiz(Questions subjectQuestions) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n--- Create a New Quiz ---");

        while (true) {
            System.out.println("Enter the question:");
            String question = input.nextLine();

            System.out.println("Enter option A:");
            String optionA = input.nextLine();
            System.out.println("Enter option B:");
            String optionB = input.nextLine();
            System.out.println("Enter option C:");
            String optionC = input.nextLine();
            System.out.println("Enter option D:");
            String optionD = input.nextLine();

            System.out.println("Enter the correct answer (A/B/C/D):");
            String correctAnswer = input.nextLine().toUpperCase();

            while (!correctAnswer.matches("[A-D]")) {
                System.out.println("Invalid choice. Please enter A, B, C, or D:");
                correctAnswer = input.nextLine().toUpperCase();
            }

            String formattedQuestion = question + "\nA) " + optionA + "\nB) " + optionB + "\nC) " + optionC + "\nD) " + optionD;
            subjectQuestions.questions.add(formattedQuestion);
            subjectQuestions.correctAnswers.add(correctAnswer);

            System.out.println("Do you want to add another question? (yes/no):");
            String continueChoice = input.nextLine().toLowerCase();

            if (!continueChoice.equals("yes")) {
                break;
            }
        }

        System.out.println("\nNew quiz created successfully!");
    }
}
