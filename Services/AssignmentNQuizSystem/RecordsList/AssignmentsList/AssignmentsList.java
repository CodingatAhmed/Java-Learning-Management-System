package Services.AssignmentNQuizSystem.RecordsList.AssignmentsList;

import java.util.*;

import Services.AssignmentNQuizSystem.Classes.Assignments.Assignment;
import Services.CourseManagement.Classes.Courses.Course;

public class AssignmentsList {
    private Map<Course, List<Assignment>> AllAssignmentsList = new HashMap<>();
    private static int totalAssignments;

    public AssignmentsList() {
        AssignmentsList.totalAssignments = 0;
    }

    public AssignmentsList(int totalAssignments, Map<Course, List<Assignment>> otherAssignments) {
        for (Course GetCourse : otherAssignments.keySet()) {
            List<Assignment> GetAssignmentList = otherAssignments.get(GetCourse);
            List<Assignment> OriginalAssignmentList = new ArrayList<>(GetAssignmentList);
            this.AllAssignmentsList.putIfAbsent(GetCourse, OriginalAssignmentList);
        }
    }

    public AssignmentsList(AssignmentsList otherAssignmentsList) {

        for (Course GetCourse : otherAssignmentsList.AllAssignmentsList.keySet()) {
            List<Assignment> GetAssignmentList = otherAssignmentsList.AllAssignmentsList.get(GetCourse);
            List<Assignment> OriginalAssignmentList = new ArrayList<>(GetAssignmentList);
            this.AllAssignmentsList.put(GetCourse, OriginalAssignmentList);

        }
    }

    public boolean AddAssignment(Course newCourse, Assignment newAssignment) {

        if (this.AllAssignmentsList.containsKey(newCourse) == false) {
            this.AllAssignmentsList.put(newCourse, new ArrayList<>());
        }

        if (!this.AllAssignmentsList.get(newCourse).contains(newAssignment)) {
            this.AllAssignmentsList.get(newCourse).add(new Assignment(newAssignment));
            System.out.println("New Quiz Added Successfully for the Course " + newCourse.GetCourseCode());
            AssignmentsList.totalAssignments += 1;
            return true;
        } else {
            System.out.println("This Quiz Already exists for the Course " + newCourse.GetCourseCode());
            return false;
        }
    }

    public boolean RemoveAssignment(Course newCourse, Assignment newAssignment) {

        if (this.AllAssignmentsList.containsKey(newCourse) == false) {
            System.out.println("The Course " + newCourse.GetCourseCode() + " is not listed");
            return false;
        } else {
            for (Assignment GetAssignment : this.AllAssignmentsList.get(newCourse)) {
                if (GetAssignment.GetAssignmentHeader() == newAssignment.GetAssignmentHeader()
                        && GetAssignment.AssignmentQuestionsList() == newAssignment.AssignmentQuestionsList()) {
                    this.AllAssignmentsList.get(newCourse).remove(GetAssignment);
                    System.out.println("Quiz Successfully Removed for the Course " + newCourse.GetCourseCode());
                    AssignmentsList.totalAssignments -= 1;
                    return true;
                }
            }
            System.out.println("The Quiz is not listed for the Course " + newCourse.GetCourseCode());
            return false;
        }
    }

    public void IterateCourseAssignments(Course newCourse) {
        System.out.println(
                "There are total of " + this.AllAssignmentsList.get(newCourse).size() + " Assignments for the Course "
                        + newCourse.GetCourseCode());
        for (Assignment GetAssignment : this.AllAssignmentsList.get(newCourse)) {
            System.out.println(GetAssignment);
        }
    }

    public void IterateAllCourseAssignments() {
        for (Course GetCourse : this.AllAssignmentsList.keySet()) {
            this.IterateCourseAssignments(GetCourse);
        }
    }

    public String ReturnAllAssignments() {
        String AllAssignments = "";
        for (Course GetCourse : this.AllAssignmentsList.keySet()) {
            AllAssignments += "\n" + "This is the Assignment for Course" + GetCourse.GetCourseCode() + "\n"
                    + this.AllAssignmentsList.get(GetCourse);
        }
        return AllAssignments;
    }

    @Override
    public String toString() {
        return "There are a Total of " + AssignmentsList.totalAssignments + " Assignments" + "\n"
                + "Here is the the List of all Assignment:"
                + this.ReturnAllAssignments();
    }

}
