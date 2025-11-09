package Services.CourseManagement.Classes.Courses;

import Services.CourseManagement.Interfaces.GetCourseDetails;
import Services.CourseManagement.Interfaces.SetCourseDetails;
import Services.UserManagement.Classes.Instructor.Instructor;

public class Course implements GetCourseDetails, SetCourseDetails, Cloneable {
    private String courseName;
    private String courseCode;
    private Instructor courseInstructor;
    // private String courseN;

    public Course() {
        this.courseName = "";
        this.courseCode = "";
        this.courseInstructor = new Instructor();
    }

    public Course(String courseName, String courseCode, Instructor courseInstructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseInstructor = new Instructor(courseInstructor);
    }

    public Course(Course otherCourse) {
        this.courseName = otherCourse.courseName;
        this.courseCode = otherCourse.courseCode;
        this.courseInstructor = new Instructor(otherCourse.courseInstructor);
    }

    @Override
    public String GetCourseName() {
        return this.courseName;
    };

    @Override
    public String GetCourseCode() {
        return this.courseCode;

    };

    @Override
    public Instructor GetCourseInstructor() {
        return this.courseInstructor;

    };

    @Override
    public void SetCourseName(String CourseName) {
        this.courseName = CourseName;
    };

    @Override
    public void SetCourseCode(String CourseCode) {
        this.courseCode = CourseCode;

    };

    @Override
    public void SetCourseInstructor(Instructor CourseInstructor) {
        this.courseInstructor = new Instructor(CourseInstructor);

    };

    @Override
    public String toString() {
        return "The Course Name is " + this.courseName + " ,the Course Code is " + this.courseCode + " , "
                + this.courseInstructor;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     Course cloneCourse = (Course) super.clone();
    //     return cloneCourse;
    // };

}
