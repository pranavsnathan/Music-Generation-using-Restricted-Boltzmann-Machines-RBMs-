/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import Business.GradStudent.GradStudent;
import Business.Newbie.Newbie;
/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private String Fname;
    private GradStudent gs;
    private Newbie n;

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

   
    private String LName;
    private String major;
    private String Ethinicity;
    private String Email;
    private String Feeling;

    public Newbie getN() {
        return n;
    }

    public void setN(Newbie n) {
        this.n = n;
    }
    
    
    
     public GradStudent getGs() {
        return gs;
    }

    public void setGs(GradStudent gs) {
        this.gs = gs;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
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
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFeeling() {
        return Feeling;
    }

    public void setFeeling(String Feeling) {
        this.Feeling = Feeling;
    }
    
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return Fname;
    }
    
    
}
