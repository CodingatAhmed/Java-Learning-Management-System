package Services.AssignmentNQuizSystem.RecordsList.AssignmentsList;

import Services.AssignmentNQuizSystem.RecordsList.AssignmentQuestionsList.AssignmentQuestionsList;

public class AssignmentsList {
    private AssignmentQuestionsList[] AllAssignmentsList;
    private static int totalAssignments;

    public AssignmentsList() {
        this.AllAssignmentsList = new AssignmentQuestionsList[0];
        AssignmentsList.totalAssignments = 0;
    }
    public AssignmentsList(int totalAssignments) {
        this.AllAssignmentsList = new AssignmentQuestionsList[totalAssignments];
        AssignmentsList.totalAssignments = 0; 
    }
    public AssignmentsList(AssignmentsList otherAssignmentsList) {
        this.AllAssignmentsList = new AssignmentQuestionsList[otherAssignmentsList.AllAssignmentsList.length];
        for (int i = 0; i< otherAssignmentsList.AllAssignmentsList.length; i++) {
            this.AllAssignmentsList[i] = otherAssignmentsList.AllAssignmentsList[i];
        }
    }

    public boolean AddAssignment(AssignmentQuestionsList newAssignmentQuestions) {
        if (AssignmentsList.totalAssignments < this.AllAssignmentsList.length) {
            this.AllAssignmentsList[AssignmentsList.totalAssignments] = new AssignmentQuestionsList(newAssignmentQuestions);
            AssignmentsList.totalAssignments += 1; 
            return true;
        }
        else {
            return false;
        }
    }

}
