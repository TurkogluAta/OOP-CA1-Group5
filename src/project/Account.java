/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.Serializable;

/**
 *
 * @author joshokeeffe
 */
public class Account implements Serializable {

    // declare variables
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String selectedCourse;

    // constructor with parameters
    public Account(String firstName, String lastName, String email, String selectedCourse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.selectedCourse = selectedCourse;
    }

    // empty constructor
    public Account() {
        firstName = "";
        lastName = "";
        email = "";
        selectedCourse = "";
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSelectedCourse(String selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getSelectedCourse() {
        return selectedCourse;
    }

    public String getDetails() {
        return "Name: " + firstName + " " + lastName + ", Email: " + email;
    }

}
