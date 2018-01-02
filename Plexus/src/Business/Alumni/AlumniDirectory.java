/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Alumni;

import java.util.ArrayList;

/**
 *
 * @author Hi
 */
public class AlumniDirectory {
     private ArrayList<Alumni> alumniList;
     
     public AlumniDirectory(){
         alumniList = new ArrayList<Alumni>();
     }

    public ArrayList<Alumni> getAlumniList() {
        return alumniList;
    }

    public void setAlumniList(ArrayList<Alumni> alumniList) {
        this.alumniList = alumniList;
    }

    
    public Alumni createAlumini(){
        Alumni al=new Alumni();
        alumniList.add(al);
        return al;
        
       
     
    }
    public void removeAlumini(Alumni al){
        alumniList.remove(al);
    }
    
}


