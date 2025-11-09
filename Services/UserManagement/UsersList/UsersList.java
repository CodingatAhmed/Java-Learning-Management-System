package Services.UserManagement.UsersList;

// import java.util.ArrayList;

import Services.UserManagement.Classes.User.User;

public class UsersList {
    private User[] AllUsers;
    private static int totalUsers;
    
    public UsersList() {
        this.AllUsers = new User[0];
        UsersList.totalUsers = 0;
    }
    public UsersList(int totalAssignments) {
        this.AllUsers = new User[totalAssignments];
        UsersList.totalUsers = 0; 
    }
    public UsersList(UsersList otherUsersList) {
        this.AllUsers = new User[otherUsersList.AllUsers.length];
        for (int i = 0; i< otherUsersList.AllUsers.length; i++) {
            this.AllUsers[i] = otherUsersList.AllUsers[i];
        }
    }
    
    public boolean AddUser(User newUser) {
        if (UsersList.totalUsers < this.AllUsers.length) {
            try {
                User myUser = (User) newUser.clone();
                this.AllUsers[UsersList.totalUsers] = myUser;
                UsersList.totalUsers += 1; 
                return true; 
                
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        else {
            return false;
        }
    }
    
}