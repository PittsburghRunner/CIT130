/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandBox;

/**
 *
 * @author christopher.eckles
 */
public abstract class PublicInfoBundle {
    String assignedCaseOfficer;
    String dateOfOrigin;
    String municipality;
    
    abstract void attachCaseMessage(String msg);
   
}//close class
