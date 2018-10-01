/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapStuff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * This demonstration deals with Maps, Iteration, and Lists. The for and while
 * loops are also used.
 *
 * @author christopher.eckles
 */
public class HashMapDemo {

    /**
     * main method for running the program
     * @param args no arguments required
     */
    public static void main(String[] args) {
        ExpeditionMap expedMap = new ExpeditionMap();
        printList(printMap(expedMap.getExpedMap()));
    }
/**
 * Method to print a map that is passed in.
 * @param map this map must  have Strings for both keys and values.
 * @return Returns a list of the values inside the map. Use it if you like.
 */
    private static List<String> printMap(Map<String, String> map) {
        System.out.println("Printing Key Values for demo map with the location of " + map.get("Location Name"));
        int keyMaxLength = 0;
        int valueMaxLength = 0;
        ArrayList<String> values = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().length() > keyMaxLength) {
                keyMaxLength = entry.getKey().length();
            }
            if (entry.getValue().length() > valueMaxLength) {
                valueMaxLength = entry.getValue().length();
            }
        }

        System.out.println("| Key" + generateWhiteSpace(keyMaxLength + 3, 3) + "| Value" + generateWhiteSpace(valueMaxLength + 1, 5) + "|");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            values.add(value);
            System.out.println("| " + key + generateWhiteSpace(keyMaxLength + 3, key.length()) + "| " + value + generateWhiteSpace(valueMaxLength + 1, value.length()) + "|");
        }
        return values;
    }
/**
 * Iterates over a list to print it.
 * @param items accepts a string list of items.
 */
    private static void printList(List<String> items) {
        Iterator iter = items.iterator();
        System.out.println("\n\n\nPrinting List:");
        while (iter.hasNext()) {
            System.out.println(iter.next());
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
