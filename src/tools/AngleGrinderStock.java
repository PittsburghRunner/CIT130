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
public class AngleGrinderStock {
    int count = 0;
    float cost = 0;
    AngleGrinder anglegrinder;

    public AngleGrinderStock(String modelNumber, int count, float cost){
    this.count = count;
    this.cost = cost;
    anglegrinder = new AngleGrinder(modelNumber);
    }
    
    public int getCount() {
        return count;
    }

    public boolean decrementCount() {
        if(count == 0){
          return  false;
        } count-- ;
        return true;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public AngleGrinder getAnglegrinder() {
        return anglegrinder;
    }

    public void setAnglegrinder(AngleGrinder anglegrinder) {
        this.anglegrinder = anglegrinder;
    }
    
}
