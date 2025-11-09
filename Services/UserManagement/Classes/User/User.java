package Services.UserManagement.Classes.User;

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

    };

    @Override
    public void logoutUser() {

    };

    @Override
    public Object clone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        return cloneUser;
    };

}
