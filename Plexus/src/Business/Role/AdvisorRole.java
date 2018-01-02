/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
//import userinterface.AmbassadorRole.AmbassadorReqWorkAreaJPanel1;
import javax.swing.JPanel;
//import userinterface.AdvisorRole.AdvisorRoleWorkAreajPanel;
import Business.Network.Network;
import userinterface.AdvisorRole.AdvisorRoleWorkAreajPanel;

public class AdvisorRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdvisorRoleWorkAreajPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
