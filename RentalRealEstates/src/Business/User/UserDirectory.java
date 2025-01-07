/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author preranagireesh
 */
public class UserDirectory {
    
    List<User> users = new ArrayList<User>();
    
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public void addUser(User user){
        users.add(user);
    }
    
    public void removeUser(User user){
        users.remove(user);
    }
    
}
