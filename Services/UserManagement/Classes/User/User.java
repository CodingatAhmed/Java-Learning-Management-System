package Services.UserManagement.Classes.User;

import java.util.Objects;

import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;
import Services.UserManagement.Classes.Student.Student;
import Services.UserManagement.Interfaces.*;
// import Services.UserManagement.Interfaces;

public abstract class User implements Cloneable, GetUserInfo, SetUserInfo, userSession {
    private String userID;
    private String userEmail;
    private String userPassword;

    public User() {
        this.userID = "";
        this.userEmail = "";
        this.userPassword = "";
    }

    public User(String userId, String userEmail, String userPass) {
        this.userID = userId;
        this.userEmail = userEmail;
        this.userPassword = userPass;
    }

    public User(User takeUser) {
        this.userID = takeUser.userID;
        this.userEmail = takeUser.userEmail;
        this.userPassword = takeUser.userPassword;
    }

    @Override
    public String GetUserId() {
        return this.userID;
    };

    @Override
    public String GetUserEmail() {
        return this.userEmail;

    };

    @Override
    public String GetUserPassword() {
        return this.userPassword;

    };

    @Override
    public void SetUserId(String userId) {
        this.userID = userId;
    };

    @Override
    public void SetUserEmail(String userEmail) {
        this.userEmail = userEmail;

    };

    @Override
    public void SetUserPassword(String userPassword) {
        this.userPassword = userPassword;

    };

    @Override
    public void loginUser() {
        System.out.println("User with UserID " + this.userID + " logged in Successfully");
    };

    @Override
    public void logoutUser() {
        System.out.println("User with UserID " + this.userID + " logged out Successfully");

    };

    @Override
    public Object clone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        return cloneUser;
    };

    @Override
    public boolean equals(Object otherUser) {
        if (this == otherUser) {
            return true;
        }
        if (!(otherUser instanceof User))
            return false;
        User OtherUser = (User) otherUser;
        return Objects.equals(this.userID, OtherUser.userID);
    }
}
