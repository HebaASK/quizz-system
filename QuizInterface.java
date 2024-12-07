/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz.system;

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