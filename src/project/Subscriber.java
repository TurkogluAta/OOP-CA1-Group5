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
    public class Subscriber implements Serializable{
    // Variable declarations
    private String name, email;
    
    public Subscriber(){
        name = " ";
        email = " ";
    }

    // Constructor
    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Getters
     public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getDetails(){
        return "Subscriber Details: Name: "+name+", Email address: "+email;
    }
}
    
