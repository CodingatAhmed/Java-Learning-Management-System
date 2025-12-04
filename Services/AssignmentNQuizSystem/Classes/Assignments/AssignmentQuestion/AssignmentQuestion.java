package Services.AssignmentNQuizSystem.Classes.Assignments.AssignmentQuestion;

import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.AssignmentQuestionInterface.GetAssignmentQuestionDetails;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.AssignmentQuestionInterface.SetAssignmentQuestionDetails;

public class AssignmentQuestion implements GetAssignmentQuestionDetails, SetAssignmentQuestionDetails {
    private String Question;
    private int Marks;

    public AssignmentQuestion() {
        this.Question = "";
        this.Marks = 0;
    }

    public AssignmentQuestion(String setQuestion, int setMarks) {
        this.Question = setQuestion;
        this.Marks = setMarks;
    }

    public AssignmentQuestion(AssignmentQuestion otherQuestion) {
        this.Question = otherQuestion.Question;
        this.Marks = otherQuestion.Marks;
    }

    @Override
    public String GetAssignmentQuestion() {
        return this.Question;
    };

    @Override
    public int GetAssignmentMarks() {
        return this.Marks;
    };

    @Override
    public void SetAssignmentQuestion(String AssignmentQuestion) {
        this.Question = AssignmentQuestion;
    };

    @Override
    public void SetAssignmentMarks(int AssignmentQuestionMarks) {
        this.Marks = AssignmentQuestionMarks;

    };

    @Override
    public String toString() {
        return this.Question + " ( " + this.Marks + " Marks" + " )";
    }
}
