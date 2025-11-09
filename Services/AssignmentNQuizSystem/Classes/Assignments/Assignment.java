package Services.AssignmentNQuizSystem.Classes.Assignments;

// import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.GetAssignmentDetails;
import Services.AssignmentNQuizSystem.Interfaces.AssignmentInterfaces.SetAssignmentDetails;

public class Assignment implements GetAssignmentDetails, SetAssignmentDetails {
    private String AssignmentTitle;
    private int AssignmentMarks;
    private String AssignmentDate;

    public Assignment() {
        this.AssignmentTitle = "";
        this.AssignmentMarks = 0;
        this.AssignmentDate = "";
    }
    public Assignment(String AssignmentTitle, int AssignmentMarks, String AssignmentDate) {
        this.AssignmentTitle = AssignmentTitle;
        this.AssignmentMarks = AssignmentMarks;
        this.AssignmentDate = AssignmentDate;
    }
    public Assignment(Assignment otherAssignment) {
        this.AssignmentTitle = otherAssignment.AssignmentTitle;
        this.AssignmentMarks = otherAssignment.AssignmentMarks;
        this.AssignmentDate = otherAssignment.AssignmentDate;
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
    public String toString() {
        return "The Assignment Title is " + this.AssignmentTitle + " and Assignment Marks are " + this.AssignmentMarks + " and Assignment will be held on " + this.AssignmentDate;
    }
}
