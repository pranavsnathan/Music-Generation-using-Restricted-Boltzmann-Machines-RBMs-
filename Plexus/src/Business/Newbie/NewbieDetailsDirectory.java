/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Newbie;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author gaura
 */
public class NewbieDetailsDirectory {

    private ArrayList<Newbie> newbieDetailsList;

    public NewbieDetailsDirectory() {
        newbieDetailsList = new ArrayList<Newbie>();
    }

    public ArrayList<Newbie> getNewbieDetailsList() {
        return newbieDetailsList;
    }

    public void setNewbieDetailsList(ArrayList<Newbie> newbieDetailsList) {
        this.newbieDetailsList = newbieDetailsList;
    }

     public Newbie createNewbie(){
        Newbie newbie = new Newbie();
        
        newbieDetailsList.add(newbie);
        
        return newbie;
    }
}
