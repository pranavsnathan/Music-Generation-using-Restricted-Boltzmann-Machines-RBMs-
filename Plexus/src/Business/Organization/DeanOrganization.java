/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.DeanRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chels
 */
public class DeanOrganization extends Organization {
    
     public DeanOrganization() {
        super(Organization.Type.Dean.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeanRole());
        return roles;
    }
    
}
