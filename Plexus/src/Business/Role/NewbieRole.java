/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NewbieOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Newbie.NewbieWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Network.Network;

/**
 *
 * @author raunak
 */
public class NewbieRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NewbieWorkAreaJPanel(userProcessContainer, account, (NewbieOrganization)organization, enterprise);
    }
    
    
}
