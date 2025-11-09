package Services.CourseManagement.Interfaces;

import Services.UserManagement.Classes.Instructor.Instructor;

public interface GetCourseDetails {
    String GetCourseName();
    String GetCourseCode();
    Instructor GetCourseInstructor();
}
