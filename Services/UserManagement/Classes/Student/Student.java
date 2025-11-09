package Services.UserManagement.Classes.Student;

import Services.UserManagement.Classes.User.User;

public class Student extends User {
    private String StudentName;

    public Student() {
        super("","","");
        this.StudentName = "";
    }

    public Student(String userId, String userEmail, String userPass, String AdminName) {
        super(userId,userEmail,userPass);
        this.StudentName = AdminName;

    }

    public Student(Student otherUser) {
        super(otherUser);
        this.StudentName = otherUser.StudentName;
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
    
    public String GetStudentName() {
        return this.StudentName;
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

    public void SetStudentName(String studentName) {
        this.StudentName = studentName;
    }
    
    @Override
    public String toString() {
        return "The Student Name is " + this.StudentName + " and the Student UserID is " + this.GetUserId() + " and Student Email is " + this.GetUserEmail();
    }

    public boolean enrollinCourse() {
        return true;
    }

}
