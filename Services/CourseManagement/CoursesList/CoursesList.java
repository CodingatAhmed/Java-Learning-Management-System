package Services.CourseManagement.CoursesList;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.print.attribute.HashAttributeSet;

import Services.CourseManagement.Classes.Courses.Course;
import Services.UserManagement.Classes.User.User;
import Services.UserManagement.UsersList.UsersList;

public class CoursesList {
    private Map<String, Course> AllCoursesList = new HashMap<>();
    private static int totalCourses;

    public CoursesList() {
        CoursesList.totalCourses = 0;
    }

    public CoursesList(Map<String, Course> otherCoursesList) {
        // this.CourseList = new Course[CoursesToEnroll];
        Course GetCourseObject;
        for (String GetCourseCode : otherCoursesList.keySet()) {
            GetCourseObject = new Course(otherCoursesList.get(GetCourseCode));
            this.AllCoursesList.put(GetCourseCode, GetCourseObject);
        }
        CoursesList.totalCourses = otherCoursesList.size();
    }

    public CoursesList(CoursesList otherList) {
        // this.CourseList = new Course[otherList.CourseList.length];
        Course GetCourseObject;
        for (String GetCourseCode : otherList.AllCoursesList.keySet()) {
            GetCourseObject = new Course(otherList.AllCoursesList.get(GetCourseCode));
            this.AllCoursesList.put(GetCourseCode, GetCourseObject);
        }
        CoursesList.totalCourses = otherList.AllCoursesList.size();
    }

    public boolean AddCourse(String newCourseCode, Course newCourse) {
        for (String GetCourseCode : this.AllCoursesList.keySet()) {
            if (GetCourseCode == newCourseCode || Objects.equals(this.AllCoursesList.get(GetCourseCode), newCourse)) {
                System.out.println("This Course Already exists in the List");
                return false;
            }
        }

        Course AddNewCourse = new Course(newCourse);
        this.AllCoursesList.put(newCourseCode, AddNewCourse);
        System.out.println("Course " + newCourseCode + " Added Successfully in the List");
        CoursesList.totalCourses += 1;
        return true;
        // try {
        // User addUser = (User) newUser.clone();
        // this.AllUser.put(newUserID, addUser);
        // UsersList.totalUsers += 1;
        // System.out.println("New User Added Successfully in the List \n UserID " +
        // newUserID + "\n " + newUser);
        // return true;
        // // this.AllUsers[UsersList.totalUsers] = myUser;

        // } catch (CloneNotSupportedException e) {
        // e.printStackTrace();
        // return false;
        // }
    }

    public boolean RemoveCourse(String newCourseCode, Course newCourse) {
        for (String GetCourseCode : this.AllCoursesList.keySet()) {
            if (GetCourseCode == newCourseCode && Objects.equals(this.AllCoursesList.get(GetCourseCode), newCourse)) {
                this.AllCoursesList.remove(GetCourseCode);
                System.out.println("Course with Course Code: " + newCourseCode + " Removed Successfully");
                CoursesList.totalCourses -= 1;
                return true;
            }
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
