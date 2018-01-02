/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Newbie;

/**
 *
 * @author gaura
 */
public class Newbie {
    
    private String FirstName;
    private String LastName;
    private String MajorAccepted;
    private String Feeling;
    private String Ethinicity;
    private String EmailID;
     private static int count = 1;
         private int id;
         
         public Newbie()
         {
             id = count;
        count++;
         }

    public String getEthinicity() {
        return Ethinicity;
    }

    public void setEthinicity(String Ethinicity) {
        this.Ethinicity = Ethinicity;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getMajorAccepted() {
        return MajorAccepted;
    }

    public void setMajorAccepted(String MajorAccepted) {
        this.MajorAccepted = MajorAccepted;
    }

    public String getFeeling() {
        return Feeling;
    }

    public void setFeeling(String Feeling) {
        this.Feeling = Feeling;
    }
    
    @Override
    public String toString() {
        return FirstName;
    }
    

   
    
}
