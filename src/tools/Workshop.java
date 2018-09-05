/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author christopher.eckles
 */
public class Workshop {
    
    public static void main(String[] args) {
        AngleGrinder firstAngleGrinder = new AngleGrinder("Grant's");
        AngleGrinder secondAngleGrinder = new AngleGrinder("Chris'");
        AngleGrinder thirdAngleGrinder = new AngleGrinder("Xander's");

        Stack <AngleGrinder> grinderStack = new Stack<>();
     //   ArrayList <AngleGrinder> grinderArray = new ArrayList<>();
        grinderStack.push(firstAngleGrinder);
        grinderStack.push(secondAngleGrinder);
        grinderStack.push(thirdAngleGrinder);

        while(grinderStack.size() > 0){
        AngleGrinder  poppedAngleGrinder = grinderStack.pop();
        System.out.println("Popping " + poppedAngleGrinder.getName());
        }
    }
    
}
