package Services.AssignmentNQuizSystem.Classes.Quizzes.QuizHeader;

import java.util.Objects;

import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;
// package Services.AssignmentNQuizSystem.Classes.Quizzes.QuizHeader;
// package Services.AssignmentNQuizSystem.Classes.Quizzes.QuizQuestion;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.AssignmentHeaderInterface.GetAssignmentHeaderDetails;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.AssignmentHeaderInterface.SetAssignmentHeaderDetails;
import Services.AssignmentNQuizSystem.Interfaces.QuizInterfaces.QuizHeaderInterface.GetQuizHeaderDetails;
import Services.AssignmentNQuizSystem.Interfaces.QuizInterfaces.QuizHeaderInterface.SetQuizHeaderDetails;

public class QuizHeader implements GetQuizHeaderDetails, SetQuizHeaderDetails {
    private String QuizID = System.currentTimeMillis() + "-" + (int) (Math.random() * 1000);
    private String QuizTitle;
    private int QuizMarks;
    private String QuizDate;

    public QuizHeader() {
        this.QuizTitle = "";
        this.QuizMarks = 0;
        this.QuizDate = "";
    }

    public QuizHeader(String QuizTitle, int QuizMarks, String QuizDate) {
        this.QuizTitle = QuizTitle;
        this.QuizMarks = QuizMarks;
        this.QuizDate = QuizDate;
    }

    public QuizHeader(QuizHeader otherQuiz) {
        this.QuizTitle = otherQuiz.QuizTitle;
        this.QuizMarks = otherQuiz.QuizMarks;
        this.QuizDate = otherQuiz.QuizDate;
    }

    @Override
    public String GetQuizID() {
        return this.QuizID;
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
    public void SetQuizTitle(String QuizTitle) {
        this.QuizTitle = QuizTitle;
    };

    @Override
    public void SetQuizMarks(int QuizMarks) {
        this.QuizMarks = QuizMarks;
    };

    @Override
    public void SetQuizDate(String QuizDate) {
        this.QuizDate = QuizDate;
    };

    @Override
    public boolean equals(Object otherHeader) {
        if (this == otherHeader) {
            return true;
        }
        if (!(otherHeader instanceof QuizHeader))
            return false;
        QuizHeader OtherQuizHeader = (QuizHeader) otherHeader;
        return Objects.equals(this.QuizID, OtherQuizHeader.QuizID);
        // return Objects.deepEquals(otherHeader, quizHeader)
    }

    @Override
    public String toString() {
        return "The Quiz Title is " + this.QuizTitle + " and Quiz Marks are " + this.QuizMarks
                + " and Quiz will be held on " + this.QuizDate;
    }
}
