package Services.UserManagement.UsersList;

import java.util.*;
import Services.UserManagement.Classes.User.User;

public class UsersList {
    private Map<String, User> AllUser = new HashMap<>();
    private static int totalUsers;

    public UsersList() {
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
            }
        }
    }

    public UsersList(UsersList otherUsersList) {
        User GetUserObject;
        for (String GetUserID : otherUsersList.AllUser.keySet()) {
            try {
                GetUserObject = (User) otherUsersList.AllUser.get(GetUserID).clone();
                this.AllUser.put(GetUserID, GetUserObject);
                UsersList.totalUsers = otherUsersList.AllUser.size();
            } catch (Exception e) {
                e.printStackTrace();
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
        if (this.AllUser.containsKey(newUserID)) {
            GetUser = this.AllUser.get(newUserID);
            System.out.println(GetUser.getClass().getSimpleName());
            this.AllUser.remove(newUserID);
            System.out.println(
                    GetUser.getClass().getSimpleName() + " with User ID: " + newUserID + " Removed Successfully");
            System.out.println("Details of Removed Student: \n" + GetUser);
            UsersList.totalUsers -= 1;
            return true;
        }
        System.out.println("The User with ID " + newUserID + " is not in the Users List, Please Enter Correct Details");
        return false;
    }

    public User GetUser(String userID) {
        if (this.AllUser.containsKey(userID)) {
            System.out.println(this.AllUser.get(userID).getClass().getSimpleName() + " with ID");
            return this.AllUser.get(userID);
        } else {
            System.out.println("User Not Found");
            return null;
        }
    }

    public void IterateAllUsers() {
        System.out.println(this.ReturnAllUsers());
    }

    public String ReturnAllUsers() {
        String AllUsers = "";
        for (String GetUserID : this.AllUser.keySet()) {
            AllUsers += "\n" + this.GetUser(GetUserID);
        }
        return AllUsers;
    }

    @Override
    public String toString() {
        return "There are a Total of " + UsersList.totalUsers + " Users" + "\n" + "Here is the the List of all Users:"
                + this.ReturnAllUsers();
    }

}