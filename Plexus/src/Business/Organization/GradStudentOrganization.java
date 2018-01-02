/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.AmbassadorRole;
import Business.Role.GradStudentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hi
 */
public class GradStudentOrganization extends Organization {
    
    public GradStudentOrganization()
    {
        super(Organization.Type.GradStudent.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GradStudentRole());
        return roles;
    }
}
