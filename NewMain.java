package quizz.system;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("Ahmed");
        Student student2 = new Student("Sara");
        Student student3 = new Student("Mohamed");

        // إضافة الدرجات للطلاب
        student1.addGrade(95);
        student1.addGrade(87);
        student1.addGrade(92);

        student2.addGrade(78);
        student2.addGrade(85);
        student2.addGrade(80);

        student3.addGrade(60);
        student3.addGrade(50);
        student3.addGrade(55);

        display display = new display();
        Login login = new Login();

        // عرض التعليمات
        display.showWelcome();
        display.showInstructions();

        // تسجيل الدخول
        login.loginUser();

        // هنا يجب تحديد الدور (طالب أو معلم)
        System.out.println("***** Select your role *****");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.print("Enter your choice (1 or 2): ");
        int mainChoice = scanner.nextInt();

         if (mainChoice == 1) {
             login.S();
            System.out.println("Choose a subject to take the quiz:");
            System.out.println("1. Geography");
            System.out.println("2. Science");
            System.out.println("3. Literature");
            System.out.print("Enter your choice (1/2/3): ");
            int subjectChoice = scanner.nextInt();

            GeographyQuestions geoQuestions = new GeographyQuestions();
            geoQuestions.setQuestions();

            ScienceQuestions scienceQuestions = new ScienceQuestions();
            scienceQuestions.setQuestions();

            LiteratureQuestions literatureQuestions = new LiteratureQuestions();
            literatureQuestions.setQuestions();

            switch (subjectChoice) {
                case 1:
                    geoQuestions.startQuiz();
                    break;
                case 2:
                    scienceQuestions.startQuiz();
                    break;
                case 3:
                    literatureQuestions.startQuiz();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } else if (mainChoice == 2) {
            login.T();
            System.out.println("Choose a subject to edit questions:");
            System.out.println("1. Geography");
            System.out.println("2. Science");
            System.out.println("3. Literature");
            System.out.println("4. See students' grades and average");
            System.out.print("Enter your choice (1/2/3/4): ");
            int subjectChoice = scanner.nextInt();

            Teacher teacher = new Teacher();
            GeographyQuestions geoQuestions = new GeographyQuestions();
            geoQuestions.setQuestions();

            ScienceQuestions scienceQuestions = new ScienceQuestions();
            scienceQuestions.setQuestions();

            LiteratureQuestions literatureQuestions = new LiteratureQuestions();
            literatureQuestions.setQuestions();

            switch (subjectChoice) {
                case 1:
                    teacher.editQuestions(geoQuestions);
                    break;
                case 2:
                    teacher.editQuestions(scienceQuestions);
                    break;
                case 3:
                    teacher.editQuestions(literatureQuestions);
                    break;
                case 4:
                    System.out.println("+----------------+---------------------+---------------------+");
        System.out.println("| Student Name   | Average             | Progress            |");
        System.out.println("+----------------+---------------------+---------------------+");
        System.out.printf("| %-14s | %-19.2f | %-19s |\n", student1.name, student1.calculateAverage(), student1.calculateProgress());
        System.out.printf("| %-14s | %-19.2f | %-19s |\n", student2.name, student2.calculateAverage(), student2.calculateProgress());
        System.out.printf("| %-14s | %-19.2f | %-19s |\n", student3.name, student3.calculateAverage(), student3.calculateProgress());
        System.out.println("+----------------+---------------------+---------------------+");
      
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Invalid choice. Exiting program.");
        }

      
        display.sayGoodbye();
        
    QuizSystem quiz = new QuizSystem();
        
        quiz.showWelcome();
        quiz.showInstructions();
        quiz.loginUser();
        quiz.startQuiz();
        quiz.addQuestion("What is 2 + 2?", "4");
        quiz.editQuestion(0, "What is 3 + 3?", "6");
        quiz.deleteQuestion(0);
        quiz.sayGoodbye();
        
     
   } // end of the main
    
    
    public interface QuizInterface {
    
    void showWelcome();
    void showInstructions();
    void sayGoodbye();

  
    void addQuestion(String question, String answer);
    void editQuestion(int index, String question, String answer);
    void deleteQuestion(int index);


    void startQuiz();

    void loginUser();
}
}

