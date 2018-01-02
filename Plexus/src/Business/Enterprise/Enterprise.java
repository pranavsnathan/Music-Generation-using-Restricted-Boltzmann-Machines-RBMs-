/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Newbie.NewbieDetailsDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.GradStudent.GradStudentDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
  // private NewbieDetailsDirectory nds;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
         //nds= new NewbieDetailsDirectory();
    }
    
    public enum EnterpriseType{
        Department("Department"),Manager("Manager");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

   /* public NewbieDetailsDirectory getNds() {
        return nds;
    }

    public void setNds(NewbieDetailsDirectory nds) {
        this.nds = nds;
    }*/

}
