package quizz.system;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Questions {
    public ArrayList<String> questions;
    public ArrayList<String> correctAnswers;

    public Questions() {
        questions = new ArrayList<>();
        correctAnswers = new ArrayList<>();
    }

   
    protected abstract void setQuestions();

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
}


class GeographyQuestions extends Questions {
    @Override
    protected void setQuestions() {
        questions.add("What is the capital of France?\nA) Berlin\nB) Madrid\nC) Paris\nD) Rome");
        correctAnswers.add("C");

        questions.add("Which continent is the Sahara Desert located in?\nA) Asia\nB) Africa\nC) Europe\nD) Australia");
        correctAnswers.add("B");

        questions.add("What is the longest river in the world?\nA) Amazon\nB) Nile\nC) Yangtze\nD) Mississippi");
        correctAnswers.add("B");
        
        
    }
}


class ScienceQuestions extends Questions {
    @Override
    protected void setQuestions() {
        questions.add("Which planet is known as the Red Planet?\nA) Earth\nB) Mars\nC) Venus\nD) Jupiter");
        correctAnswers.add("B");

        questions.add("What is the chemical symbol for water?\nA) CO2\nB) H2O\nC) O2\nD) H2");
        correctAnswers.add("B");

        questions.add("Which organ in the human body pumps blood?\nA) Liver\nB) Brain\nC) Heart\nD) Lungs");
        correctAnswers.add("C");
        
       
    }
}

class LiteratureQuestions extends Questions {
    @Override
    protected void setQuestions() {
        questions.add("Who wrote 'Hamlet'?\nA) Charles Dickens\nB) William Shakespeare\nC) Mark Twain\nD) J.K. Rowling");
        correctAnswers.add("B");

        questions.add("What is the main theme of '1984' by George Orwell?\nA) Freedom\nB) Totalitarianism\nC) Love\nD) Adventure");
        correctAnswers.add("B");

        questions.add("Who is the author of 'Pride and Prejudice'?\nA) Jane Austen\nB) Emily Brontë\nC) Mary Shelley\nD) Charlotte Brontë");
        correctAnswers.add("A");
        
    }
}
