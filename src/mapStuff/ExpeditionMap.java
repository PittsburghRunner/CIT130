/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapStuff;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author christopher.eckles
 */
public class ExpeditionMap {

    private Map<String, String> expedMap = new HashMap();

    public ExpeditionMap() {
        expedMap.put("Location Name", "Starfleet Headquarters");
        expedMap.put("Organization", "Starfleet");
        expedMap.put("Objective", "Gather Intel");
        expedMap.put("Planet", "Earth");
    }

    public Map<String, String> getExpedMap() {
        return expedMap;
    }

    public void setExpedMap(Map<String, String> expedMap) {
        this.expedMap = expedMap;
    }
}
