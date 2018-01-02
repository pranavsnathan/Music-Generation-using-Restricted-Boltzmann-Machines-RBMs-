/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NewbieOrganization;
import Business.Organization.AlumniOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Alumni.AlumniWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Network.Network;

/**
 *
 * @author chels
 */
public class AlumniRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AlumniWorkAreaJPanel(userProcessContainer, account, (AlumniOrganization)organization, enterprise);
    }
 
    
}
