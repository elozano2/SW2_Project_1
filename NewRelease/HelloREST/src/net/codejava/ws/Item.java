package net.codejava.ws;

import java.util.Scanner;



public class Item {
    Scanner scan = new Scanner(System.in);
    
    public double price;
    public String itemName;
    
    public Item[] menu = new Item[13];
    public void setPrices(){
    Item printer = new Item();
    printer.itemName = "Print a Page";
    printer.price = 0.10;
    Item scantron = new Item();
    scantron.itemName = "Scantron";
    scantron.price = 0.30;
    Item bluebook = new Item();
    bluebook.itemName = "Bluebook";
    bluebook.price = 0.50;
    Item pencil = new Item();
    pencil.itemName = "Pencil";
    pencil.price = 0.80;
    Item pen = new Item();
    pen.itemName = "Pen";
    pen.price = 1;
    Item notebook = new Item();
    notebook.itemName = "NoteBook";
    notebook.price = 3;
    Item backpack = new Item();
    backpack.itemName = "Backpack";
    backpack.price = 30;
    Item bigeraser = new Item();
    bigeraser.itemName = "Big Eraser";
    bigeraser.price = 1;
    Item mechanicalpencil = new Item();
    mechanicalpencil.itemName = "Mechanical Pencil";
    mechanicalpencil.price = 1;
    Item leadpack = new Item();
    leadpack.itemName = "Lead Pack";
    leadpack.price = 2;
    Item waterbottle = new Item();
    waterbottle.itemName = "Water Bottle";
    waterbottle.price = 5;
    Item binder = new Item();
    binder.itemName = "Binder";
    binder.price = 4;
    Item marker = new Item();
    marker.itemName = "Marker";
    marker.price = 2;
    
    menu[0] = printer;
    menu[1] = scantron;
    menu[2] = bluebook;
    menu[3] = pencil;
    menu[4] = pen;
    menu[5] = mechanicalpencil;
    menu[6] = leadpack;
    menu[7] = bigeraser;
    menu[8] = marker;
    menu[9] = notebook;
    menu[10] = binder;
    menu[11] = waterbottle;
    menu[12] = backpack;
    }
    
    public void buyItem(Item item, Student student){
        System.out.print(student.name + " has purchased a " + item.itemName + ".\n");
        System.out.print(item.price + " points have been deducted from " + student.name + "'s balance.\n");
        //student.card.rcbalance -= item.price;
        //System.out.print(student.name + "'s balance is now " + student.card.rcbalance + "\n");
    }
    public Item getItem(String itemName){
        Item item = new Item();
        for(int i = 0; i < 13; i++){
            if(menu[i].itemName.equalsIgnoreCase(itemName)){
                return menu[i];
            }
        }
        System.out.print("Item not found.\n");
        return null;
    }
    public void display_Menu(Student student){
        System.out.print("Hello, " + student.name + ". Following is the menu with the correspoinding prices.\n");
        for(int i = 0; i < 13; i++){
            System.out.print(menu[i].itemName + ": " + menu[i].price + "\n");
        }
        System.out.print("----------------------\n");
        System.out.print("What would you like to purchase?\n");
        String item = scan.nextLine();
        buyItem(getItem(item), student);
        System.out.print("Would you like to purchase more? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            display_Menu(student);
        }
        else if(input.equalsIgnoreCase("n")){
            System.out.print("Have a great day!\n");
        }
    }
    
}