/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.Serializable;

/**
 *
 * @author ataturkoglu
 */
public class feedback extends Account implements Serializable {

    private String feedback;

    public feedback(String firstName, String lastName, String email, String selectedCourse, String feedback, String name) {
        super(firstName, lastName, email, null);
        this.feedback = feedback;
    }

    public feedback() {
        super();
        feedback = " ";
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Feedback: " + feedback;
    }
}
