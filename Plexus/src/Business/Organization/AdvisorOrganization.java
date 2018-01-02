/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdvisorRole;
import Business.Role.AmbassadorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hi
 */
public class AdvisorOrganization extends Organization {
    
    public AdvisorOrganization() {
        super(Organization.Type.Advisor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvisorRole());
        return roles;
    }
     
    
    
    
    
    
}
