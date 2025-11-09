package Services.CourseManagement.CoursesList;

import Services.CourseManagement.Classes.Courses.Course;

public class CoursesList {
    private Course[] CourseList;
    private static int totalCourses;
    public CoursesList() {
        this.CourseList = new Course[totalCourses];
        totalCourses += 1;
    }

    public CoursesList(int CoursesToEnroll) {
        this.CourseList = new Course[CoursesToEnroll];
        totalCourses += CoursesToEnroll + 1;
    }

    public CoursesList(CoursesList otherList) {
        this.CourseList = new Course[otherList.CourseList.length];
        for (int i = 0; i< otherList.CourseList.length; i++) {
            this.CourseList[i] = otherList.CourseList[i];
        }
        totalCourses += CoursesList.totalCourses + 1;
    }

    public boolean AddCourse(Course newCourse) {
        if (CoursesList.totalCourses < this.CourseList.length) {
            this.CourseList[CoursesList.totalCourses] = new Course(newCourse);
            return true;
        }
        else {
            return false;
        }
    }

    public void IterateAllCourses() {
        for (Course course: this.CourseList) {
            System.out.println(course);
        }
    }

}
