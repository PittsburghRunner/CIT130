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
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> demoMap = new HashMap<>();

        demoMap.put("Location Name", "Starfleet Headquarters");
        demoMap.put("Organization", "Starfleet");
        demoMap.put("Objective", "Gather Intel");
        demoMap.put("Planet", "Earth");

        System.out.println("Printing Key Values for demo map with the location of " + demoMap.get("Location Name"));

        System.out.println("|Key" + generateWhiteSpace(20, 3) + "|Value" + generateWhiteSpace(25, 5) + "|");
        for (Map.Entry<String, String> entry : demoMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("|" + key + generateWhiteSpace(20, key.length()) + "|" + value + generateWhiteSpace(25, value.length()) + "|");
        }
    }

    private static String generateWhiteSpace(int maxlength, int lengthOffset) {
        String whiteSpace = "";
        for (int i = lengthOffset; i < maxlength; i++) {
            whiteSpace = whiteSpace + " ";
        }
        return whiteSpace;
    }

}
