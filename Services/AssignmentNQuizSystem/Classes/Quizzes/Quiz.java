package Services.AssignmentNQuizSystem.Classes.Quizzes;

import Services.AssignmentNQuizSystem.Interfaces.QuizInterfaces.GetQuizDetails;
import Services.AssignmentNQuizSystem.Interfaces.QuizInterfaces.SetQuizDetails;

public class Quiz implements GetQuizDetails, SetQuizDetails {
    private String QuizTitle;
    private int QuizMarks;
    private String QuizDate;

    public Quiz() {
        this.QuizTitle = "";
        this.QuizMarks = 0;
        this.QuizDate = "";
    }
    public Quiz(String QuizTitle, int QuizMarks, String QuizDate) {
        this.QuizTitle = QuizTitle;
        this.QuizMarks = QuizMarks;
        this.QuizDate = QuizDate;
    }
    public Quiz(Quiz otherQuiz) {
        this.QuizTitle = otherQuiz.QuizTitle;
        this.QuizMarks = otherQuiz.QuizMarks;
        this.QuizDate = otherQuiz.QuizDate;
    }

    @Override
    public String GetQuizTitle() {
        return this.QuizTitle;
    };
    
    @Override
    public int GetQuizMarks() {
        return this.QuizMarks;        
    };
    
    @Override
    public String GetQuizDate() {
        return this.QuizDate;
    };

    @Override
    public void SetQuizTitle(String quizTitle) {
        this.QuizTitle = quizTitle;
    };
    
    @Override
    public void SetQuizMarks(int quizMarks) {
        this.QuizMarks = quizMarks;
    };
    
    @Override
    public void SetQuizDate(String quizDate) {
        this.QuizDate = quizDate;
    };

    @Override
    public String toString() {
        return "The Quiz Title is " + this.QuizTitle + " and Quiz Marks are " + this.QuizMarks + " and Quiz will be held on " + this.QuizDate;
    }

}
