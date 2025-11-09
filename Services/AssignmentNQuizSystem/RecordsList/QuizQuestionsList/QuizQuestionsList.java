package Services.AssignmentNQuizSystem.RecordsList.QuizQuestionsList;

// import Services.AssignmentNQuizSystem.Classes.Assignments.Assignment;
import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;
// import Services.AssignmentNQuizSystem.RecordsList.AssignmentQuestionsList.AssignmentQuestionsList;

public class QuizQuestionsList {
    private Quiz[] QuizQuestions;
    private int totalQuestions;

    public QuizQuestionsList() {
        this.QuizQuestions = new Quiz[0];
        this.totalQuestions = 0;
    }

    public QuizQuestionsList(int TotalQuestions) {
        this.QuizQuestions = new Quiz[TotalQuestions];
        this.totalQuestions = 0;
    }

    public QuizQuestionsList(QuizQuestionsList otherAssignmentQsList) {
        this.QuizQuestions = new Quiz[otherAssignmentQsList.QuizQuestions.length];
        for (int i = 0; i< otherAssignmentQsList.QuizQuestions.length; i++) {
            this.QuizQuestions[i] = otherAssignmentQsList.QuizQuestions[i];
        }
        this.totalQuestions = 0;
    }

    public boolean AddQuestion(Quiz addQuestion) {
        if (this.totalQuestions < QuizQuestions.length) {
            QuizQuestions[this.totalQuestions] = new Quiz(addQuestion); 
            this.totalQuestions += 1;
            return true;
        }
        else {
            return false;
        }
    }
}
