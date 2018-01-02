/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Alumni.Alumni;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Newbie.getValue())){
            organization = new NewbieOrganization();
            organizationList.add(organization);
        }
       
         else if (type.getValue().equals(Type.Ambassador.getValue())){
            organization = new AmbassadorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Advisor.getValue())){
            organization = new AdvisorOrganization();
            organizationList.add(organization);
        }
         else if(type.getValue().equals(Type.GradStudent.getValue())){
            
             
             organization = new GradStudentOrganization();
             organizationList.add(organization);
         }
         else if(type.getValue().equals(Type.Alumni.getValue())){
             organization = new AlumniOrganization();
             organizationList.add(organization);
         }
         else if(type.getValue().equals(Type.Dean.getValue())){
             organization = new DeanOrganization();
             organizationList.add(organization);
         }else if(type.getValue().equals(Type.UniversityDean.getValue())){
             organization = new UniversityDeanOrganization();
             organizationList.add(organization);
         }
        
        return organization;
    }
}