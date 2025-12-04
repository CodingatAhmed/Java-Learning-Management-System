package Services.UserManagement.UsersList;

// import java.util.ArrayList;
import java.lang.*;
import java.util.*;

import Services.AssignmentNQuizSystem.Classes.Assignments.Assignment;
import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;
import Services.AssignmentNQuizSystem.RecordsList.AssignmentQuestionsList.AssignmentQuestionsList;
import Services.AssignmentNQuizSystem.RecordsList.QuizzesList.QuizzesList;
import Services.UserManagement.Classes.User.User;

public class UsersList {
    private Map<String, User> AllUser = new HashMap<>();
    private User[] AllUsers;
    private static int totalUsers;

    public UsersList() {
        ;
        UsersList.totalUsers = 0;
    }

    public UsersList(Map<String, User> OtherList) {
        User GetUserObject;
        for (String GetUserID : OtherList.keySet()) {
            try {
                GetUserObject = (User) OtherList.get(GetUserID).clone();
                this.AllUser.put(GetUserID, GetUserObject);
                UsersList.totalUsers = OtherList.size();
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        }
    }

    // public AssignmentQuestionsList(AssignmentQuestionsList otherAssignmentQsList)
    // {
    // Assignment getAssignmentQuestion;
    // this.AssignmentQuestions = new LinkedHashMap<>();
    // for (Integer getAssignmentQuestionNumber :
    // otherAssignmentQsList.AssignmentQuestions.keySet()) {
    // getAssignmentQuestion =
    // otherAssignmentQsList.AssignmentQuestions.get(getAssignmentQuestionNumber);
    // this.AssignmentQuestions.put(getAssignmentQuestionNumber,
    // getAssignmentQuestion);
    // }

    // this.totalQuestions = otherAssignmentQsList.totalQuestions;
    // }

    public UsersList(UsersList otherUsersList) {
        User GetUserObject;
        for (String GetUserID : otherUsersList.AllUser.keySet()) {
            try {
                GetUserObject = (User) otherUsersList.AllUser.get(GetUserID).clone();
                this.AllUser.put(GetUserID, GetUserObject);
                UsersList.totalUsers = otherUsersList.AllUser.size();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

    public boolean AddUser(User newUser) {
        if (this.AllUser.containsKey(newUser.GetUserId())) {
            System.out.println("This User Already exists in the List");
            return false;
        }
        try {
            User addUser = (User) newUser.clone();
            this.AllUser.put(addUser.GetUserId(), addUser);
            UsersList.totalUsers += 1;
            System.out.println("New " + addUser.getClass().getSimpleName() + " with ID " + addUser.GetUserId()
                    + " Added Successfully in the List");
            return true;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean RemoveUser(String newUserID) {
        User GetUser;
        for (String GetUserID : this.AllUser.keySet()) {
            // if (GetUserID == newUserID && Objects.equals(this.AllUser.get(GetUserID),
            // newUser)) {
            if (GetUserID == newUserID) {
                GetUser = this.AllUser.get(GetUserID);
                System.out.println(GetUser.getClass().getSimpleName());
                this.AllUser.remove(GetUserID);
                // if (GetUserID instanceof )
                System.out.println(
                        GetUser.getClass().getSimpleName() + " with User ID: " + newUserID + " Removed Successfully");
                System.out.println("Details of Removed Student: \n" + GetUser);
                UsersList.totalUsers -= 1;
                return true;
            }
        }
        System.out.println("The User with ID " + newUserID + " is not in the Users List, Please Enter Correct Details");
        return false;
    }

    public User GetUser(String userID) {
        if
        return this.AllUser.get(userID);
    }

    public void IterateAllUsers() {
        System.out.println(this.ReturnAllUsers());
    }

    public String ReturnAllUsers() {
        String AllUsers = "";
        for (String GetUserID : this.AllUser.keySet()) {
            AllUsers += "\n" + this.ReturnUser(GetUserID);
        }
        return AllUsers;
    }

    @Override
    public String toString() {
        return "There are a Total of " + UsersList.totalUsers + " Users" + "\n" + "Here is the the List of all Users:"
                + this.ReturnAllUsers();
    }

}