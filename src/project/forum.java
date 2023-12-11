/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author ataturkoglu
 */
public class forum implements Serializable {

    private String question;
    private String subject;
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public forum() {
        subject = " ";
        question = " ";
        id = generateRandomId();
        firstName = " ";
        lastName = " ";
        email = " ";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuestion() {
        return question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int generateRandomId() {
        Random random = new Random();
        // Generates a number between 1000 and 9999
        return 1000 + random.nextInt(9000);
    }

    public String getDetails() {
        return "Id: " + id + ", Name: " + firstName + "  " + lastName + ", Email: " + email + ", Subject: " + subject + ", Question: " + question;
    }
}
