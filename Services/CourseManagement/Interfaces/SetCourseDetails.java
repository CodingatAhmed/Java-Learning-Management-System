package Services.CourseManagement.Interfaces;

import Services.UserManagement.Classes.Instructor.Instructor;

public interface SetCourseDetails {
    void SetCourseName(String CourseName);
    void SetCourseCode(String CourseCode);
    void SetCourseInstructor(Instructor CourseInstructor);
}
