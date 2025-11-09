package Main;

import Services.UserManagement.Classes.Instructor.Instructor;
import Services.UserManagement.Classes.Student.Student;
import Services.CourseManagement.Classes.Courses.Course;
import Services.CourseManagement.CoursesList.CoursesList;

public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student("B24110006014", "a@gmail.com", "a2005", "Ahmed");
        Instructor Instructor1 = new Instructor("B2411--", "misshumera@gmail.com", "misshumeratariq",
                "Miss Humera Tariq");
        Instructor Instructor2 = new Instructor("B2411--", "sirhuzaifa@gmail.com", "sirhuzaifa",
                "Sir Huzaifa");
        Course Course1 = new Course("Object Oriented Programming", "CS3--", Instructor1);
        Course Course2 = new Course("Linear Algebra", "CS3--", Instructor2);
        CoursesList newCoursesList = new CoursesList(3);
        newCoursesList.AddCourse(Course1);
        newCoursesList.AddCourse(Course2);
        System.out.println(newStudent);
        System.out.println(Instructor1);
        System.out.println(Course1);
        newCoursesList.IterateAllCourses();

    }
}
