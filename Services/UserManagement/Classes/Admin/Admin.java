package Services.UserManagement.Classes.Admin;

import Services.UserManagement.Classes.User.User;

public class Admin extends User {
    private String AdminName;

    public Admin() {
        super("","","");
        this.AdminName = "";
    }

    public Admin(String userId, String userEmail, String userPass, String AdminName) {
        super(userId,userEmail,userPass);
        this.AdminName = AdminName;

    }

    public Admin(Admin otherUser) {
        super(otherUser);
        this.AdminName = otherUser.AdminName;
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
    
    public String GetAdminName() {
        return this.AdminName;
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

    public void SetAdminName(String adminName) {
        this.AdminName = adminName;
    }

    @Override
    public String toString() {
        return "The Admin Name is " + this.AdminName + " and the Admin UserID is " + this.GetUserId() + " and Admin Email is " + this.GetUserEmail();
    }
}
