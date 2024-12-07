/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz.system;

import java.util.Scanner;


public class Teacher {
    
    public void editQuestions(Questions subjectQuestions) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("\n--- Edit Questions ---");
        while (true) {
            System.out.println("\nCurrent Questions:");
            for (int i = 0; i < subjectQuestions.questions.size(); i++) {
                System.out.println((i + 1) + ". " + subjectQuestions.questions.get(i));
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add a Question");
            System.out.println("2. Edit an Existing Question");
            System.out.println("3. Delete a Question");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter the new question: ");
                    String newQuestion = scanner.nextLine();
                    System.out.print("Enter the correct answer (A/B/C/D): ");
                    String newAnswer = scanner.nextLine().toUpperCase();
                    subjectQuestions.questions.add(newQuestion);
                    subjectQuestions.correctAnswers.add(newAnswer);
                    System.out.println("Question added successfully!");
                    break;

                case 2: 
                    System.out.print("Enter the number of the question to edit: ");
                    int questionNumber = scanner.nextInt();
                    scanner.nextLine(); 

                    if (questionNumber > 0 && questionNumber <= subjectQuestions.questions.size()) {
                        System.out.print("Enter the updated question: ");
                        String updatedQuestion = scanner.nextLine();
                        System.out.print("Enter the updated correct answer (A/B/C/D): ");
                        String updatedAnswer = scanner.nextLine().toUpperCase();

                        subjectQuestions.questions.set(questionNumber - 1, updatedQuestion);
                        subjectQuestions.correctAnswers.set(questionNumber - 1, updatedAnswer);

                        System.out.println("Question updated successfully!");
                    } else {
                        System.out.println("Invalid question number!");
                    }
                    break;

                case 3: // حذف سؤال
                    System.out.print("Enter the number of the question to delete: ");
                    int deleteNumber = scanner.nextInt();

                    if (deleteNumber > 0 && deleteNumber <= subjectQuestions.questions.size()) {
                        subjectQuestions.questions.remove(deleteNumber - 1);
                        subjectQuestions.correctAnswers.remove(deleteNumber - 1);

                        System.out.println("Question deleted successfully!");
                    } else {
                        System.out.println("Invalid question number!");
                    }
                    break;

                case 4: 
                    System.out.println("Exiting edit mode.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
