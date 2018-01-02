/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Newbie.NewbieDetailsDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import Business.GradStudent.GradStudentDirectory;
import Business.GradStudent.GradStudent;
import Business.Alumni.AlumniDirectory;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
   
    private UserAccountDirectory userAccountDirectory;
    private NewbieDetailsDirectory nds;
    private GradStudentDirectory gsd;
    private AlumniDirectory al;
    private int organizationID;
    private static int counter;
    private Employee emp;
    
    public enum Type{
        Admin("Admin Organization"),Newbie("Newbie Organization"),
        Ambassador("Ambassador"),GradStudent("Graduate Student Organization"),
        Dean("Dean Organization"),Alumni("Alumni Organization"),Advisor("Advisor Organization"), UniversityDean("University Dean Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        nds = new NewbieDetailsDirectory();
        al=new AlumniDirectory();
        gsd= new GradStudentDirectory();
        emp=new Employee();
        organizationID = counter;
        ++counter;
    }

    public AlumniDirectory getAl() {
        return al;
    }

    public void setAl(AlumniDirectory al) {
        this.al = al;
    }
    

    public GradStudentDirectory getGsd() {
        return gsd;
    }

    public void setGsd(GradStudentDirectory gsd) {
        this.gsd = gsd;
    }
    
   
    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public NewbieDetailsDirectory getNds() {
        return nds;
    }

    public void setNds(NewbieDetailsDirectory nds) {
        this.nds = nds;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
