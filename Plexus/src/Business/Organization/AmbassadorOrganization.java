/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbassadorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AmbassadorOrganization extends Organization{

    public AmbassadorOrganization() {
        super(Organization.Type.Ambassador.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbassadorRole());
        return roles;
    }
     
   
    
    
}
