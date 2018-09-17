/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdiagrams.patternprinting;

/**
 *
 * @author delores
 */
public class PyramidLooper implements PyramidPrinter {

    final String WHITE_SPACE = " ";
    final String SIDE_UNIT_CHAR = "*";

    public void printAPyramid(int baseSize) {
        int rowWhiteSpace = ((baseSize + (baseSize % 2)) / 2);
        int rowFill = 1;
        
        System.out.println("Printing a pyramid with " + baseSize + " sized base.");
        
        for (int outer = 0; outer < baseSize; outer++) {
            for (int i = 0; i < rowWhiteSpace; i++) {
                System.out.print(WHITE_SPACE);
            }
            for (int i = 0; i < rowFill; i++) {
                System.out.print(SIDE_UNIT_CHAR);
            }
            rowFill = rowFill + 2;
            rowWhiteSpace--;
            System.out.println("");
        }

    }

}
