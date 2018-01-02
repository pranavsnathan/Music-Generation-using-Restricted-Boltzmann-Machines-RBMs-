/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Alumni;

/**
 *
 * @author Hi
 */
public class Alumni {
    
    private String FirstName;
    private String LastName;
    private String Employed;
    private String YearOfPassing;
    private String Companyame;
    private String TechnologyUsed;
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

    public String getEmployed() {
        return Employed;
    }

    public void setEmployed(String Employed) {
        this.Employed = Employed;
    }

    public String getYearOfPassing() {
        return YearOfPassing;
    }

    public void setYearOfPassing(String YearOfPassing) {
        this.YearOfPassing = YearOfPassing;
    }

    public String getCompanyame() {
        return Companyame;
    }

    public void setCompanyame(String Companyame) {
        this.Companyame = Companyame;
    }

    public String getTechnologyUsed() {
        return TechnologyUsed;
    }

    public void setTechnologyUsed(String TechnologyUsed) {
        this.TechnologyUsed = TechnologyUsed;
    }
    
     @Override
    public String toString(){
        return FirstName;
    }
   
    
    
}
