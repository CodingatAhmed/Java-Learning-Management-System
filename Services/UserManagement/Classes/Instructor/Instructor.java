package Services.UserManagement.Classes.Instructor;

import Services.UserManagement.Classes.User.User;

public class Instructor extends User {
    private String InstructorName;

    public Instructor() {
        super("", "", "");
        this.InstructorName = "";
    }

    public Instructor(String userId, String userEmail, String userPass, String InstructorName) {
        super(userId, userEmail, userPass);
        this.InstructorName = InstructorName;

    }

    public Instructor(Instructor otherUser) {
        super(otherUser);
        this.InstructorName = otherUser.InstructorName;
    }

    @Override
    public String GetUserId() {
        return super.GetUserId();
    };

    @Override
    public String GetUserEmail() {
        return super.GetUserEmail();
    };

    @Override
    public String GetUserPassword() {
        return super.GetUserPassword();
    };

    public String GetInstructorName() {
        return this.InstructorName;
    }

    @Override
    public void SetUserId(String userId) {
        super.SetUserId(userId);
    };

    @Override
    public void SetUserEmail(String userEmail) {
        super.SetUserEmail(userEmail);
    };

    @Override
    public void SetUserPassword(String userPassword) {
        super.SetUserPassword(userPassword);
    };

    public void SetInstructorName(String InstructorName) {
        this.InstructorName = InstructorName;
    }

    @Override
    public String toString() {
        return "The Instructor Name is " + this.InstructorName + " and the Instructor UserID is " + this.GetUserId()
                + " and Instructor Email is " + this.GetUserEmail();
    }
}
