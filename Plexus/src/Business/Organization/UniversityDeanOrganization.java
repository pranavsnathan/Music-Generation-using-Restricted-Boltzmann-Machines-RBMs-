/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.UniversityDeanRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chels
 */
public class UniversityDeanOrganization extends Organization {
    
     public UniversityDeanOrganization() {
        super(Organization.Type.UniversityDean.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UniversityDeanRole());
        return roles;
    }
    
}
