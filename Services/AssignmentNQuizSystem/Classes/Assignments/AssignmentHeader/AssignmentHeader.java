package Services.AssignmentNQuizSystem.Classes.Assignments.AssignmentHeader;

import java.util.Objects;

import Services.AssignmentNQuizSystem.Classes.Quizzes.QuizHeader.QuizHeader;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.AssignmentHeaderInterface.GetAssignmentHeaderDetails;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.AssignmentHeaderInterface.SetAssignmentHeaderDetails;

public class AssignmentHeader implements GetAssignmentHeaderDetails, SetAssignmentHeaderDetails {
    private String AssignmentID = System.currentTimeMillis() + "-" + (int) (Math.random() * 1000);
    private String AssignmentTitle;
    private int AssignmentMarks;
    private String AssignmentDate;

    public AssignmentHeader() {
        this.AssignmentTitle = "";
        this.AssignmentMarks = 0;
        this.AssignmentDate = "";
    }

    public AssignmentHeader(String AssignmentTitle, int AssignmentMarks, String AssignmentDate) {
        this.AssignmentTitle = AssignmentTitle;
        this.AssignmentMarks = AssignmentMarks;
        this.AssignmentDate = AssignmentDate;
    }

    public AssignmentHeader(AssignmentHeader otherAssignment) {
        this.AssignmentTitle = otherAssignment.AssignmentTitle;
        this.AssignmentMarks = otherAssignment.AssignmentMarks;
        this.AssignmentDate = otherAssignment.AssignmentDate;
    }

    @Override
    public String GetAssignmentID() {
        return this.AssignmentID;
    }

    @Override
    public String GetAssignmentTitle() {
        return this.AssignmentTitle;
    };

    @Override
    public int GetAssignmentMarks() {
        return this.AssignmentMarks;
    };

    @Override
    public String GetAssignmentDeadLine() {
        return this.AssignmentDate;
    };

    @Override
    public void SetAssignmentTitle(String AssignmentTitle) {
        this.AssignmentTitle = AssignmentTitle;
    };

    @Override
    public void SetAssignmentMarks(int AssignmentMarks) {
        this.AssignmentMarks = AssignmentMarks;
    };

    @Override
    public void SetAssignmentDeadLine(String AssignmentDate) {
        this.AssignmentDate = AssignmentDate;
    };

    @Override
    public boolean equals(Object otherHeader) {
        if (this == otherHeader) {
            return true;
        }
        if (!(otherHeader instanceof AssignmentHeader))
            return false;
        AssignmentHeader OtherAssignmentHeader = (AssignmentHeader) otherHeader;
        return Objects.equals(this.AssignmentID, OtherAssignmentHeader.AssignmentID);
        // return Objects.deepEquals(otherHeader, quizHeader)
    }

    @Override
    public String toString() {
        return "The Assignment Title is " + this.AssignmentTitle + " and Assignment Marks are " + this.AssignmentMarks
                + " and Assignment Last Date of Submission " + this.AssignmentDate;
    }
}
