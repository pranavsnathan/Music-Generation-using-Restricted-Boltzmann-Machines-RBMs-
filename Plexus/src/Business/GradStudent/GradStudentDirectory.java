/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GradStudent;

import java.util.ArrayList;
import Business.Employee.Employee;

/**
 *
 * @author Hi
 */
public class GradStudentDirectory {
    
        private ArrayList<GradStudent> gradStudentList;
    
    public GradStudentDirectory(){
        gradStudentList=new ArrayList<GradStudent>();
    }

    public ArrayList<GradStudent> getGradStudentList() {
        return gradStudentList;
    }

    public void setGradStudentList(ArrayList<GradStudent> gradStudentList) {
        this.gradStudentList = gradStudentList;
    }
    
    public GradStudent createGradStudent(){
        GradStudent gs= new GradStudent();
        gradStudentList.add(gs);
        return gs;
    }
    
    public void removeGradStudent(GradStudent gs)
    {
        gradStudentList.remove(gs);
    }
    
}

    

