package quizz.system;



import java.util.ArrayList;
import java.util.Scanner;

class Questions {
        private ArrayList<String> questions;
        private ArrayList<String> correctAnswers;

       
        public Questions() {
            questions = new ArrayList<>();
            correctAnswers = new ArrayList<>();

           
            questions.add("What is the capital of France?\nA) Berlin\nB) Madrid\nC) Paris\nD) Rome");
            correctAnswers.add("C");

            questions.add("Which planet is known as the Red Planet?\nA) Earth\nB) Mars\nC) Venus\nD) Jupiter");
            correctAnswers.add("B");

            questions.add("Who wrote 'Hamlet'?\nA) Charles Dickens\nB) William Shakespeare\nC) Mark Twain\nD) J.K. Rowling");
            correctAnswers.add("B");
        }

        
        public void startQuiz() {
            Scanner scanner = new Scanner(System.in);
            int score = 0;

            System.out.println("\n--- Quiz Start ---");
            for (int i = 0; i < questions.size(); i++) {
                System.out.println("\nQuestion " + (i + 1) + ":");
                System.out.println(questions.get(i));
                System.out.print("Your answer (A/B/C/D): ");
                String answer = scanner.nextLine().toUpperCase();

               
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
}