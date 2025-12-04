package Services.AssignmentNQuizSystem.Classes.Quizzes.QuizQuestion;

import java.util.Objects;
import Services.AssignmentNQuizSystem.Interfaces.QuizInterfaces.QuizQuestionInterface.GetQuizQuestionDetails;
import Services.AssignmentNQuizSystem.Interfaces.QuizInterfaces.QuizQuestionInterface.SetQuizQuestionDetails;

public class QuizQuestion implements GetQuizQuestionDetails, SetQuizQuestionDetails {
    private String Question;
    private int Marks;

    public QuizQuestion() {
        this.Question = "";
        this.Marks = 0;
    }

    public QuizQuestion(String setQuestion, int setMarks) {
        this.Question = setQuestion;
        this.Marks = setMarks;
    }

    public QuizQuestion(QuizQuestion otherQuestion) {
        this.Question = otherQuestion.Question;
        this.Marks = otherQuestion.Marks;
    }

    @Override
    public String GetQuizQuestion() {
        return this.Question;
    };

    @Override
    public int GetQuizMarks() {
        return this.Marks;
    };

    @Override
    public void SetQuizQuestion(String QuizQuestion) {
        this.Question = QuizQuestion;
    };

    @Override
    public void SetQuizMarks(int QuizQuestionMarks) {
        this.Marks = QuizQuestionMarks;

    };

    @Override
    public boolean equals(Object otherQuizQuestion) {
        if (this == otherQuizQuestion) {
            return true;
        }
        if (!(otherQuizQuestion instanceof QuizQuestion))
            return false;
        QuizQuestion OtherQuizQuestion = (QuizQuestion) otherQuizQuestion;
        return Objects.equals(this.Question, OtherQuizQuestion.Question)
                && Objects.equals(this.Marks, OtherQuizQuestion.Marks);
    }

    @Override
    public String toString() {
        return this.Question + " ( " + this.Marks + " Marks" + " )";
    }
}