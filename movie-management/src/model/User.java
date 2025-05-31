package model;

import java.sql.Date;

public class User {
    public int id;
    public String name;
    public String password; // CODE SMELL: Storing plain text password
    public String email;
    public int age;
    public String phoneNumber;
    public String role;
    public boolean isActive;
    public Date registrationDate;
    
    // CODE SMELL: Empty constructor without initialization
    public User() {
    }
    
    // CODE SMELL: Inappropriate Intimacy - direct field access from outside
    public void displayUserInfo() {
        System.out.println("User: " + name + " (" + role + ")");
    }
}

