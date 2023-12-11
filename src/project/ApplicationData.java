/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author dongyiyoo
 */

public class ApplicationData {

    // GUI1  Variable declarations
    private String name, affiliation, affName, schoolType, goals, schoolName, numStudents, numTeachers;

    // GUI2 Variable declarations
    private String currentFunds, fundraisingPlan, others, projectGoals, schoolOperationPlans;

    public ApplicationData() {
       
        name = "";
        affiliation = "";
        affName = "";
        schoolType = "";
        goals = "";
        schoolName = "";
        numStudents = "";
        numTeachers = "";
        currentFunds = "";
        fundraisingPlan = "";
        others = "";
        projectGoals = "";
        schoolOperationPlans = "";
       
    }
    
    // Constructor
    public ApplicationData(String name, String affiliation, String affName, String schoolType, String goals, String schoolName, String numStudents, String numTeachers, String currentFunds, String fundraisingPlan, String others, String projectGoals, String schoolOperationPlans) {
        this.name = name;
        this.affiliation = affiliation;
        this.affName = affName;
        this.schoolType = schoolType;
        this.goals = goals;
        this.schoolName = schoolName;
        this.numStudents = numStudents;
        this.numTeachers = numTeachers;
        this.currentFunds = currentFunds;
        this.fundraisingPlan = fundraisingPlan;
        this.others = others;
        this.projectGoals = projectGoals;
        this.schoolOperationPlans = schoolOperationPlans;
    }
    
    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setAffName(String affName) {
        this.affName = affName;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setNumStudents(String numStudents) {
        this.numStudents = numStudents;
    }

    public void setNumTeachers(String numTeachers) {
        this.numTeachers = numTeachers;
    }

    public void setCurrentFunds(String currentFunds) {
        this.currentFunds = currentFunds;
    }

    public void setFundraisingPlan(String fundraisingPlan) {
        this.fundraisingPlan = fundraisingPlan;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void setProjectGoals(String projectGoals) {
        this.projectGoals = projectGoals;
    }

    public void setSchoolOperationPlans(String schoolOperationPlans) {
        this.schoolOperationPlans = schoolOperationPlans;
    }
    

    //getters
    public String getName() {
        return name;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getAffName() {
        return affName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public String getGoals() {
        return goals;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getNumStudents() {
        return numStudents;
    }

    public String getNumTeachers() {
        return numTeachers;
    }

    public String getCurrentFunds() {
        return currentFunds;
    }

    public String getFundraisingPlan() {
        return fundraisingPlan;
    }

    public String getOthers() {
        return others;
    }

    public String getProjectGoals() {
        return projectGoals;
    }

    public String getSchoolOperationPlans() {
        return schoolOperationPlans;
    }
}

    

