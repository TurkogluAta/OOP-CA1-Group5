/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.Serializable;

/**
 *
 * @author dongyiyoo
 */


public class Donation implements Serializable {
    // Variable declarations
    private String name, email, schoolName,schoolType,msg ;
    private int phoneNumber;
   
    public Donation() {
        name = "";
        email = "";
        phoneNumber = 0;
        schoolName = "";
        schoolType = "";
        msg = "";
    }

    // Constructor
    public Donation(String name, String email, int phoneNumber, String schoolName, String schoolType, String msg) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.schoolName = schoolName;
        this.schoolType = schoolType;
        this.msg = msg;
    }

    // Setter 
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolType(String schoolType) { 
        this.schoolType = schoolType;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // Getter 
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolType() { 
        return schoolType;
    }

    public String getMsg() {
        return msg;
    }
    public String getDetails(){
        return "Donor Details: Name: "+name+", Email address: "+email+", Selected School Type: "+schoolType;
    }
}
