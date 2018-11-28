/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionPractice;

import java.util.Scanner;

/**
 *
 * @author christopher.eckles
 */
public class ExceptionPractice {

    public static void main(String[] args) {
        try {
            while (true){
               accessArray();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Bad index value!"); 
            //e.printStackTrace();
        }
    }

    public static int getUserInput() {
        int userIntPut = 0;
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("(type '-1' to exit!)\n\n What index do you want to access?: ");
        try {
            userIntPut = userInputScanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error in answer. Not an Integer");
        }
        if (userIntPut == -1){
            System.exit(0);
        }
        return userIntPut;
    }

        public static int getUserInput(int max) {
            int userInput = getUserInput();
            if (userInput < max){
                return userInput;
            } else {
                return 0;
            }
        }
    
    public static void accessArray() throws IndexOutOfBoundsException {
        int[] testArray = new int[5];

        testArray[0] = 2342342;
        testArray[1] = 2178120;
        testArray[2] = 95;
        testArray[3] = 2342342;
        testArray[4] = 7842;
        
        int userInt = getUserInput();
        
        System.out.println("Accessing Array:" +  userInt + " value:" + testArray[userInt]);
    
    }
}
