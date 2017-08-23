package com.tiy;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private ArrayList<String> items;
    private static Integer numberOfPens = 0;
    private static Integer numberOfFolders = 0;
    private static Integer numberOfPencils = 0;

    public Backpack(){
        items = new ArrayList<>();
    }

    public void addItem(String item){
        if(item.equals("pen")) {
            numberOfPens += 1;
        } else if (item.equals("pencil")) {
            numberOfPencils += 1;
        } else if (item.equals("folder")){
            numberOfFolders += 1;
        }
        items.add(item);
    }

    public void removeItem(String item){
        if(items.contains(item)) {
            if (item.equals("pen")) {
                numberOfPens -= 1;
            } else if (item.equals("pencil")) {
                numberOfPencils -= 1;
            } else if (item.equals("folder")) {
                numberOfFolders -= 1;
            }
            items.remove(item);
        }
    }


    public static Integer getNumberOfPens() {
        return numberOfPens;
    }

    public static Integer getNumberOfFolders() {
        return numberOfFolders;
    }

    public static Integer getNumberOfPencils() {
        return numberOfPencils;
    }

    public static void printTrackedInventory(){
        System.out.println("------Printing Tracked Counts----------");
        System.out.println("Number of pens in all backpacks: " + numberOfPens);
        System.out.println("Number of pencils in all backpacks: " + numberOfPencils);
        System.out.println("Number of folders in all backpacks: " + numberOfFolders);
        System.out.println("---------------------------------------");
    }

    public void printInventory(){
        System.out.println("------Printing backpack inventory------");
        for (String item : this.items) {
            System.out.println("Backpack contains: " + item);
        }
        System.out.println("---------------------------------------");
    }
}
