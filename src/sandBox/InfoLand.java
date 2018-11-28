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
public class InfoLand {
    public static void main(String[] args) {
        PublicInfoBundle pib = new OccupancyPermitApplicationInfo();
        OccupancyPermitApplicationInfo occ = (OccupancyPermitApplicationInfo)pib;
        System.out.println(occ.occupancyType);
    }
}
