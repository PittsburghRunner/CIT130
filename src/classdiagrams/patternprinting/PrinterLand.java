/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdiagrams.patternprinting;

/**
 * Demo client class which instantiates objects
 * who are part of a multi-class structure.
 * @author delores
 */
public class PrinterLand {
    public static void main(String[] args) {
//        BoxPrinter bp = new LoopingBoxer();
//        bp.printABox(5);
//        
//        System.out.println("\n\n\n new box\n");
//        
//        BoxPrinter bp2 = new LoopingBoxerToo();
//        bp2.printABox(5);

        PyramidPrinter pm = new PyramidLooper();
        pm.printAPyramid(5);
        
        
        pm.printAPyramid(10);



    }
    
}
