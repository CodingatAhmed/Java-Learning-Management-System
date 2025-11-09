package Services.CourseManagement.CoursesList;

import Services.CourseManagement.Classes.Courses.Course;

public class CoursesList {
    private Course[] CourseList;
    private static int totalCourses;

    public CoursesList() {
        this.CourseList = new Course[totalCourses];
        CoursesList.totalCourses = 0;
    }

    public CoursesList(int CoursesToEnroll) {
        this.CourseList = new Course[CoursesToEnroll];
        CoursesList.totalCourses = 0;
    }

    public CoursesList(CoursesList otherList) {
        this.CourseList = new Course[otherList.CourseList.length];
        for (int i = 0; i < otherList.CourseList.length; i++) {
            this.CourseList[i] = otherList.CourseList[i];
        }
        CoursesList.totalCourses = 0;
    }

    public boolean AddCourse(Course newCourse) {
        if (CoursesList.totalCourses < this.CourseList.length) {
            this.CourseList[CoursesList.totalCourses] = new Course(newCourse);
            CoursesList.totalCourses += 1;
            return true;

        } else {
            return false;
        }
    }

    public void IterateAllCourses() {
        for (Course course : this.CourseList) {
            System.out.println(course);
        }
    }

}
