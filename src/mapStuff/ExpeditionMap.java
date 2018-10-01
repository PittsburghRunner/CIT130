/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapStuff;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the container object for the Expedition map demo.
 * @author christopher.eckles
 */
public class ExpeditionMap {

    private Map<String, String> expedMap = new HashMap();
/**
 * Constructor for this class.
 */
    public ExpeditionMap() {
        expedMap.put("Location Name", "Starfleet Headquarters");
        expedMap.put("Organization", "Starfleet");
        expedMap.put("Objective", "Gather Intel");
        expedMap.put("Planet", "Earth");
    }
/**
 * Gets the exped map.
 * @return returns the exped map.
 */
    public Map<String, String> getExpedMap() {
        return expedMap;
    }
/**
 * Sets the exped map.
 * @param expedMap accepts a map of string string. 
 */
    public void setExpedMap(Map<String, String> expedMap) {
        this.expedMap = expedMap;
    }
}
