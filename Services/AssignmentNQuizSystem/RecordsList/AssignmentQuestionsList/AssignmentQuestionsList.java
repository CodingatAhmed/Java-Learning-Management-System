package Services.AssignmentNQuizSystem.RecordsList.AssignmentQuestionsList;

import Services.AssignmentNQuizSystem.Classes.Assignments.Assignment;
import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;

public class AssignmentQuestionsList {
    private Assignment[] AssignmentQuestions;
    private int totalQuestions;

    public AssignmentQuestionsList() {
        this.AssignmentQuestions = new Assignment[0];
        this.totalQuestions = 0;
    }

    public AssignmentQuestionsList(int TotalQuestions) {
        this.AssignmentQuestions = new Assignment[TotalQuestions];
        this.totalQuestions = 0;
    }

    public AssignmentQuestionsList(AssignmentQuestionsList otherAssignmentQsList) {
        this.AssignmentQuestions = new Assignment[otherAssignmentQsList.AssignmentQuestions.length];
        for (int i = 0; i < otherAssignmentQsList.AssignmentQuestions.length; i++) {
            this.AssignmentQuestions[i] = otherAssignmentQsList.AssignmentQuestions[i];
        }
        this.totalQuestions = 0;
    }

    public boolean AddQuestion(Assignment addQuestion) {
        if (this.totalQuestions < AssignmentQuestions.length) {
            AssignmentQuestions[this.totalQuestions] = new Assignment(addQuestion);
            this.totalQuestions += 1;
            return true;
        } else {
            return false;
        }
    }

    public void IterateAllQuizQuestions() {
        for (Assignment AssignmentQuestion : this.AssignmentQuestions) {
            System.out.println(AssignmentQuestion);
        }
    }

}
