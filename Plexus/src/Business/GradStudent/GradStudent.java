/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GradStudent;

/**
 *
 * @author Hi
 */
public class GradStudent {
    
    private String FName;
    private String LName;
    private String course;
    private String coursetaken1;
    private String coursetaken2;
    private String college;
    private String currentSem;
    private String major;
    private String Ethinicity;
    private String email;
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCoursetaken1() {
        return coursetaken1;
    }

    public void setCoursetaken1(String coursetaken1) {
        this.coursetaken1 = coursetaken1;
    }

    public String getCoursetaken2() {
        return coursetaken2;
    }

    public void setCoursetaken2(String coursetaken2) {
        this.coursetaken2 = coursetaken2;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCurrentSem() {
        return currentSem;
    }

    public void setCurrentSem(String currentSem) {
        this.currentSem = currentSem;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEthinicity() {
        return Ethinicity;
    }

    public void setEthinicity(String Ethinicity) {
        this.Ethinicity = Ethinicity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return FName;
    }
   
    
    
}
