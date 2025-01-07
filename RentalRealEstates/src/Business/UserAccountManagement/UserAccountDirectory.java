/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccountManagement;

import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author rajesh
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public UserAccount addAccount(UserAccount userAccount) {
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount removeccount(UserAccount userAccount) {
        userAccountList.remove(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String userName) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public UserAccount createUserAccount(String userName, String pwd, Roles role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(userName);
        userAccount.setPwd(pwd);

        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount authenticateUser(String userName, String pwd) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName) && ua.getPwd().equals(pwd)) {
                return ua;
            }
        }
        return null;
    }

    public ArrayList<UserAccount> getUserAccList() {
        return userAccountList;
    }

    public void setUserAccList(ArrayList<UserAccount> userAccList) {
        this.userAccountList = userAccList;
    }
    
}
