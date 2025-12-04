package Services.CourseManagement.CoursesList;

import java.util.HashMap;
import java.util.Map;
import Services.CourseManagement.Classes.Courses.Course;

public class CoursesList {
    private Map<String, Course> AllCoursesList = new HashMap<>();
    private static int totalCourses;

    public CoursesList() {
        CoursesList.totalCourses = 0;
    }

    public CoursesList(Map<String, Course> otherCoursesList) {
        Course GetCourseObject;
        for (String GetCourseCode : otherCoursesList.keySet()) {
            GetCourseObject = new Course(otherCoursesList.get(GetCourseCode));
            this.AllCoursesList.put(GetCourseCode, GetCourseObject);
        }
        CoursesList.totalCourses = otherCoursesList.size();
    }

    public CoursesList(CoursesList otherList) {
        Course GetCourseObject;
        for (String GetCourseCode : otherList.AllCoursesList.keySet()) {
            GetCourseObject = new Course(otherList.AllCoursesList.get(GetCourseCode));
            this.AllCoursesList.put(GetCourseCode, GetCourseObject);
        }
        CoursesList.totalCourses = otherList.AllCoursesList.size();
    }

    public boolean AddCourse(Course newCourse) {
        if (this.AllCoursesList.containsKey(newCourse.GetCourseCode())) {
            System.out.println("This Course Already exists in the List");
            return false;
        }

        Course AddNewCourse = new Course(newCourse);
        this.AllCoursesList.put(AddNewCourse.GetCourseCode(), AddNewCourse);
        System.out.println("Course " + AddNewCourse.GetCourseCode() + " Added Successfully in the List");
        CoursesList.totalCourses += 1;
        return true;
    }

    public boolean RemoveCourse(String newCourseCode) {
        if (this.AllCoursesList.containsKey(newCourseCode)) {
            this.AllCoursesList.remove(newCourseCode);
            System.out.println("Course with Course Code: " + newCourseCode + " Removed Successfully");
            CoursesList.totalCourses -= 1;
            return true;
        }
        System.out.println("The Course " + newCourseCode + " is not in the Course List");
        return false;
    }

    public Course ReturnCourse(String CourseCode) {
        return this.AllCoursesList.get(CourseCode);
    }

    public void IterateAllCourses() {
        System.out.println(this.ReturnAllCourses());
    }

    public String ReturnAllCourses() {
        String AllCourses = "";
        for (String GetCourseCode : this.AllCoursesList.keySet()) {
            AllCourses += "\n" + this.ReturnCourse(GetCourseCode);
        }
        return AllCourses;
    }

    @Override
    public String toString() {
        return "There are a Total of " + CoursesList.totalCourses + " Courses" + "\n"
                + "Here is the the List of all Courses:" + this.ReturnAllCourses();
    }
}
