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
public class teacher extends Account implements Serializable {

    private String subject;
    private String location;
    private int age;
    private String experience;
    private String other_info;
    private String timeType;

    public teacher(String firstName, String lastName, String email, String selectedCourse, String subject, String location, int age, String experience, String other_info, String timeType){
        super(firstName, lastName, email, null);
        this.subject = subject;
        this.location = location;
        this.age = age;
        this.experience = experience;
        this.other_info = other_info;
        this.timeType = timeType;
    }

    public teacher() {
        super();
        subject = " ";
        location = " ";
        age = 0;
        experience = " ";
        other_info = " ";
        timeType = " ";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getOther_info() {
        return other_info;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public void setOther_info(String other_info) {
        this.other_info = other_info;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Subject: " + subject + ", Location: " + location + ", Age: " + age + ", Experience: " + experience + ", Other information: " + other_info + ", Time type: " + timeType;
    }
}
