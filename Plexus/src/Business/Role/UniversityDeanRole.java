/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeanOrganization;
import Business.Organization.Organization;
import Business.Organization.UniversityDeanOrganization;
import Business.UserAccount.UserAccount;
import userinterface.SuperDean.SuperDeanWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Network.Network;
/**
 *
 * @author chels
 */
public class UniversityDeanRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SuperDeanWorkAreaJPanel(userProcessContainer, account, (UniversityDeanOrganization)organization, enterprise,network);
    }
}
