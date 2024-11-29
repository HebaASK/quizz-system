import java.util.Scanner;

public interface Quiz {
    void startQuiz();
    void submitAnswers();
    void showResults();
    String getQuizTitle();
}

public class OnlineQuiz implements Quiz {
    private String title;
    private String[] questions;
    private String[] answers;
    private String[] userAnswers;
    private Scanner scanner;

    public OnlineQuiz(String title, String[] questions, String[] answers) {
        this.title = title;
        this.questions = questions;
        this.answers = answers;
        this.userAnswers = new String[questions.length];
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void startQuiz() {
        System.out.println("بدء الاختبار: " + title);
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            System.out.print("Enter your answer: ");
            userAnswers[i] = scanner.nextLine();
        }
    }

    @Override
    public void submitAnswers() {
        System.out.println("Answer have been submitted...");
      
    }

    @Override
    public void showResults() {
        int correctAnswers = 0;
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(answers[i])) {
                correctAnswers++;
            }
        }
        System.out.println("لقد حصلت على " + correctAnswers + " من " + answers.length + " إجابة صحيحة.");
    }

    @Override
    public String getQuizTitle() {
        return title;
    }

    // نقطة دخول البرنامج
    public static void main(String[] args) {
        String title = "" ;
        String[] questions = {
            
        };
        String[] answers = {
         ""
           ""
        };

        OnlineQuiz quiz = new OnlineQuiz(title, questions, answers);
        
        quiz.startQuiz();
        quiz.submitAnswers();
        quiz.showResults();
        
      
    }
}
