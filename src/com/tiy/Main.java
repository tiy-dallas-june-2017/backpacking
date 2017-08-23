package com.tiy;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Backpack firstBackpack = new Backpack();
        firstBackpack.addItem("pen");
        firstBackpack.addItem("iPad");
        firstBackpack.printInventory();
        Backpack.printTrackedInventory();

        Backpack secondBackpack = new Backpack();
        secondBackpack.addItem("pencil");
        secondBackpack.addItem("pencil");
        secondBackpack.addItem("folder");
        secondBackpack.printInventory();
        Backpack.printTrackedInventory();

        secondBackpack.removeItem("pencil");
        secondBackpack.removeItem("pencil");
        secondBackpack.removeItem("pencil");
        secondBackpack.printInventory();
        Backpack.printTrackedInventory();

    }
}
