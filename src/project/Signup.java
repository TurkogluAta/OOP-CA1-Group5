/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author joshokeeffe
 */
public class Signup extends Account {

    // constructor
    public Signup(String firstName, String lastName, String email, String selectedCourse) {
        super();
    }

    // empty constructor
    public Signup() {
        firstName = "";
        lastName = "";
        email = "";
        selectedCourse = "";
    }

    // method to get users details and return a formatted string
    public String getDetails() {
        return "SignUp Information:"
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nEmail: " + email
                + "\nSelected Course: " + selectedCourse;
    }
}
