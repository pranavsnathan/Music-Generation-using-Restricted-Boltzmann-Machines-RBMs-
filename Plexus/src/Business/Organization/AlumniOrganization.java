/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AlumniRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chels
 */
public class AlumniOrganization extends Organization{
    public AlumniOrganization() {
        super(Organization.Type.Alumni.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AlumniRole());
        return roles;
    }
    
}
