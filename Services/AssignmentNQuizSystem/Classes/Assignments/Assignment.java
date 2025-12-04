package Services.AssignmentNQuizSystem.Classes.Assignments;

import java.util.*;
import Services.AssignmentNQuizSystem.Classes.Assignments.AssignmentHeader.AssignmentHeader;
import Services.AssignmentNQuizSystem.Classes.Assignments.AssignmentQuestion.AssignmentQuestion;

public class Assignment {
    private AssignmentHeader assignmentHeader;
    private ArrayList<AssignmentQuestion> allQuestionsList = new ArrayList<>();

    public Assignment(AssignmentHeader addAssignmentHeader) {
        this.assignmentHeader = new AssignmentHeader(addAssignmentHeader);
    }

    public Assignment(AssignmentHeader otherAssignmentHeader, ArrayList<AssignmentQuestion> allQuestions) {
        this.assignmentHeader = new AssignmentHeader(otherAssignmentHeader);
        for (AssignmentQuestion eachQuestion : allQuestionsList) {
            this.allQuestionsList.add(eachQuestion);
        }

    }

    public Assignment(Assignment otherAssignment) {
        this.assignmentHeader = new AssignmentHeader(otherAssignment.assignmentHeader);
        for (AssignmentQuestion eachQuestion : otherAssignment.allQuestionsList) {
            this.allQuestionsList.add(eachQuestion);
        }
    }

    public AssignmentHeader GetAssignmentHeader() {
        return this.assignmentHeader;
    }

    public ArrayList<AssignmentQuestion> AssignmentQuestionsList() {
        return this.allQuestionsList;
    }

    @Override
    public boolean equals(Object otherAssignment) {
        if (this == otherAssignment) {
            return true;
        }
        if (!(otherAssignment instanceof Assignment))
            return false;
        Assignment OtherAssignment = (Assignment) otherAssignment;
        return Objects.equals(this.GetAssignmentHeader(), OtherAssignment.GetAssignmentHeader());
    }

    public boolean AddAssignmentQuestion(AssignmentQuestion addQuestion) {
        try {
            allQuestionsList.add(addQuestion);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void IterateHeaderDetails() {
        System.out.println(this.assignmentHeader);
    }

    public void IterateAllQuestions() {
        for (int i = 0; i < this.allQuestionsList.size(); i++) {
            System.out.println("Question No. " + i + " " + this.allQuestionsList.get(i));
        }
    }

    public void ShowFullAssignment() {
        IterateHeaderDetails();
        IterateAllQuestions();
    }

    public String ReturnAllQuestions() {
        String allQuestions = "";
        for (int i = 0; i < this.allQuestionsList.size(); i++) {
            allQuestions += ("\n" + "Q" + (i + 1) + ": " + this.allQuestionsList.get(i));
        }
        return allQuestions;
    }

    @Override
    public String toString() {
        return (this.assignmentHeader.toString() + "\n\n" + "It has total of " + this.allQuestionsList.size()
                + " Questions: \n" + this.ReturnAllQuestions());
    }
}
