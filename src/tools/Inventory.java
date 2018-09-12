/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author christopher.eckles
 */
public class Inventory {

    private static LinkedList<AngleGrinderStock> angleGrinderStockList = new LinkedList();
    //LinkedList<String> stringDemo;

    public static void main(String[] args) {
        //make a scanner object
        int choice = 0;
        System.out.println("Inventory Program");

        while (choice != 9) {
            Scanner inputScanner = new Scanner(System.in);

            //tell user the options
            System.out.println("Choose a Method to run");
            System.out.println("0 - Print Inventory");
            System.out.println("1 - Add Item To Inventory");
            System.out.println("2 - Remove First Item");
            System.out.println("3 - Remove Last Item");
            System.out.println("4 - Remove Middle Item");
            System.out.println("5 - Add Sample Inventory");
            System.out.println("9 - To Exit");

            System.out.print("Type your choice and press enter: ");
            //get integer from user
            try {
                choice = inputScanner.nextInt();
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 0:
                    printInventory();
                    break;
                case 1:
                    addInventory();
                    break;
                case 2:
                    removeFirstItem();
                    break;
                case 3:
                    removeLastItem();
                    break;
                case 4:
                    removeMiddleItem();
                    break;
                case 5:
                    addInventorySample();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("No valid input..");
            }
        }
        System.out.println("Exiting");
    }//close main method

    public static void addInventorySample() {
        angleGrinderStockList.add(new AngleGrinderStock("ABC", 2, 29.99f));
        angleGrinderStockList.add(new AngleGrinderStock("DEF", 8, 21.99f));
        angleGrinderStockList.add(new AngleGrinderStock("HIJ", 5, 19.99f));
        angleGrinderStockList.add(new AngleGrinderStock("XYZ", 2, 50.99f));

    }

    public static void addInventory() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the model number: ");
        String model = inputScanner.next();
        System.out.println("Please enter the quantity: ");
        int count = inputScanner.nextInt();
        System.out.println("Please enter the price: ");
        float cost = inputScanner.nextFloat();

        angleGrinderStockList.add(new AngleGrinderStock(model, count, cost));

    }

    public static void removeFirstItem() {
        int size = angleGrinderStockList.size();
        if (size > 0) {
            if (angleGrinderStockList.peekFirst().getCount() > 1) {
                angleGrinderStockList.peekFirst().decrementCount();
                System.out.println("Removing First Item: " + angleGrinderStockList.peekFirst().getAnglegrinder().getModelNumber());

            } else {
                AngleGrinderStock angleGrinderStockItem = angleGrinderStockList.removeFirst();
                System.out.println("Removing First Item: " + angleGrinderStockItem.getAnglegrinder().getModelNumber());
            }
            //pop
        }
        printInventory();
    }

    public static void removeLastItem() {
        int size = angleGrinderStockList.size();
        if (size > 0) {
            if (angleGrinderStockList.peekLast().getCount() > 1) {
                angleGrinderStockList.peekLast().decrementCount();
                System.out.println("Removing First Item: " + angleGrinderStockList.peekLast().getAnglegrinder().getModelNumber());

            } else {
                AngleGrinderStock angleGrinderStockItem = angleGrinderStockList.removeLast();
                System.out.println("Removing First Item: " + angleGrinderStockItem.getAnglegrinder().getModelNumber());
            }
            //pop
        }
        printInventory();
    }

    public static void removeMiddleItem() {
        int size = angleGrinderStockList.size();
        System.out.println("size" + size);
        int itemIndexToRemove;
        if (size > 0) {
            if (size % 2 == 0) {
                System.out.println("size div by 0");
                itemIndexToRemove = (size / 2) - 1;
            } else {
                System.out.println("size not div by 0");

                itemIndexToRemove = (size - 1) / 2;
            }
            if (angleGrinderStockList.get(itemIndexToRemove).getCount() > 1) {
                angleGrinderStockList.get(itemIndexToRemove).decrementCount();
                System.out.println("Removing Middle Item: " + angleGrinderStockList.get(itemIndexToRemove).getAnglegrinder().getModelNumber());
            } else {
                System.out.println("Removing Middle Item: " + angleGrinderStockList.get(itemIndexToRemove).getAnglegrinder().getModelNumber());
                angleGrinderStockList.remove(itemIndexToRemove);
            }
            System.out.println("Index to remove: " + itemIndexToRemove);

        } else {
            System.out.println("Nothing to remove.");
        }
        printInventory();
    }

    public static void printInventory() {
        float total = 0f;
        System.out.println("\n\n\n********Priting Report*********\n");
        if (angleGrinderStockList.size() > 0) {
            for (AngleGrinderStock angleGrinderStockItem : angleGrinderStockList) {
                System.out.println(angleGrinderStockList.indexOf(angleGrinderStockItem) + " - Qty:" + angleGrinderStockItem.getCount() + " of " + angleGrinderStockItem.getAnglegrinder().getModelNumber() + " @ $" + angleGrinderStockItem.getCost());
                total = (angleGrinderStockItem.getCost() * angleGrinderStockItem.getCount()) + total;
            }
        }
        System.out.println("\n");
        System.out.println("Total Inventory Assets $" + total);
        System.out.println("\n");

    }

}
