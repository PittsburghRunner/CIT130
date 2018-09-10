/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author christopher.eckles
 */
public class AngleGrinder {

    public final static String CLASS_NAME = "Angle Grinder" ;
    public final static float SIZE_INCHES = 4.5f ;
    public final static float RPMS_DEFAULT_ON = 11000f ;
    public final static float RPMS_DEFAULT_OFF = 0f ;

    private boolean isPluggedIn;
    private boolean switchedOn;
    private boolean thermalBreakerTripped;
    private boolean accessoryConnected;
    
    private float rpms = RPMS_DEFAULT_OFF;
    
    public String modelNumber = "";

    public AngleGrinder(String modelNumber) {
    this.modelNumber = modelNumber;
}
    public String getModelNumber(){
        return modelNumber+ " " +CLASS_NAME;
    }
    public boolean isPluggedIn() {
        System.out.println(CLASS_NAME + "isPluggedIn: " + isPluggedIn);
        return isPluggedIn;
    }

    public void powerSwitchOn(boolean toggle) {
        this.switchedOn = toggle;
    }

    public boolean isPowerOn() {
        System.out.println(CLASS_NAME + "isPowerOn: " + switchedOn);
        return switchedOn;
    }

    public void pressTrigger() {
        if (isPluggedIn()) {
            if (!thermalBreakerTripped) {
                if (accessoryConnected){
                   System.out.println("Power is on.");
                    setRpms(RPMS_DEFAULT_ON);
                    this.switchedOn = true; 
                }           
            } else {
                System.out.println("Not plugged in.");
                this.switchedOn = false;
            }
        }
    }

    public boolean isThermalBreakerTripped() {
        return thermalBreakerTripped;
    }

    public void thermalBreakerTripped() {
        
        this.switchedOn = false;
        this.thermalBreakerTripped = true;
    }

    public boolean isAccessoryConnected() {
        return accessoryConnected;
    }

    public void accessoryConnected() {
        this.accessoryConnected = true;
    }

    public float getRpms() {
        return rpms;
    }

    public void setRpms(float rpms) {
        this.rpms = rpms;
    }

 
}
