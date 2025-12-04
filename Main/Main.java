package Main;

import Services.UserManagement.Classes.Instructor.Instructor;
import Services.UserManagement.Classes.Student.Student;
import Services.UserManagement.Classes.User.User;
import Services.UserManagement.UsersList.UsersList;

import java.util.*;

import Services.AssignmentNQuizSystem.Classes.Assignments.Assignment;
import Services.AssignmentNQuizSystem.Classes.Assignments.AssignmentHeader.AssignmentHeader;
import Services.AssignmentNQuizSystem.Classes.Assignments.AssignmentQuestion.AssignmentQuestion;
import Services.CourseManagement.Classes.Courses.Course;
import Services.CourseManagement.CoursesList.CoursesList;

public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student("B24110006014", "a@gmail.com", "a2005",
                "Ahmed");
        Student newStudent1 = new Student("B24110006086", "a@gmail.com", "a2005",
                "Arham");
        UsersList ListUsers = new UsersList();
        ListUsers.AddUser(newStudent);
        ListUsers.RemoveUser("B24110006014");
        ListUsers.AddUser(newStudent);
        // ListUsers.AddUser(newStudent1);
        // System.out.println(ListUsers.GetUser("B2411000601"));
        // ListUsers.RemoveUser("B24110006013");
        // System.out.println(ListUsers);
        // newStudent1.SetUserId("ehhe");
        // ListUsers.IterateAllUsers();
        // System.out.println(newStudent.equals(newStudent1));
        // System.out.println(Objects.equals(newStudent, newStudent1));
        // System.out.println(Objects.equals(newStudent.GetUserId(),
        // newStudent1.GetUserId()));
        // User student = newStudent;
        // Instructor Instructor1 = new Instructor("B2411--", "misshumera@gmail.com",
        // "misshumeratariq",
        // "Miss Humera Tariq");
        // Instructor Instructor2 = new Instructor("B2411--", "sirhuzaifa@gmail.com",
        // "sirhuzaifa",
        // "Sir Huzaifa");
        // Course Course1 = new Course("Object Oriented Programming", "CS3--",
        // Instructor1);
        // Course Course2 = new Course("Linear Algebra", "CS3--", Instructor2);
        // System.out.println(Course1.equals(Course2));
        // CoursesList newCoursesList = new CoursesList(3);
        // newCoursesList.AddCourse(Course1);
        // newCoursesList.AddCourse(Course2);
        // System.out.println(newStudent);
        // System.out.println(Instructor1);
        // System.out.println(Course1);
        // newCoursesList.IterateAllCourses();
        // AssignmentHeader newAssignmentTitle = new AssignmentHeader("Lesson 1", 10,
        // "10/10/2026");
        // AssignmentQuestion Question1 = new AssignmentQuestion("Difference between obj
        // and class", 5);
        // AssignmentQuestion Question2 = new AssignmentQuestion("what is shallow and
        // deep copy", 5);
        // Assignment newAssignment = new Assignment(newAssignmentTitle);
        // newAssignment.ne
        // newAssignment.AddAssignmentQuestion(Question1);
        // newAssignment.AddAssignmentQuestion(Question2);
        // System.out.println(newAssignment);
        // List<String> myString = new ArrayList<>();
        // myString.add("Hello");
        // myString.add("World");
        // System.out.println(myString);

    }
}
