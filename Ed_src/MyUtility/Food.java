//Software Engineering II Project
//Meal Plan Project
//Elijah Silang

package MyUtility;

import java.util.Scanner;

public class Food {
    Scanner scan = new Scanner(System.in);
    
    public int price;
    public String itemName;
    
    public Food[] menu = new Food[4];
    public void setPrices(){
    Food hamburger = new Food();
    hamburger.itemName = "Hamburger";
    hamburger.price = 7;
    Food pasta = new Food();
    pasta.itemName = "Pasta";
    pasta.price = 10;
    Food fries = new Food();
    fries.itemName = "Fries";
    fries.price = 4;
    Food drink = new Food();
    drink.itemName = "Drink";
    drink.price = 2;
    menu[0] = hamburger;
    menu[1] = pasta;
    menu[2] = fries;
    menu[3] = drink;
    
    }
    
    public void buyFood(Food food, Student student){
        System.out.print(student.name + " has purchased a " + food.itemName + ".\n");
        System.out.print(food.price + " points have been deducted from " + student.name + "'s balance.\n");
        student.card.balance -= food.price;
        System.out.print(student.name + "'s balance is now " + student.card.balance + "\n");
    }
    public Food getFood(String itemName){
        Food food = new Food();
        for(int i = 0; i < 4; i++){
            if(menu[i].itemName.equalsIgnoreCase(itemName)){
                return menu[i];
            }
        }
        System.out.print("Food not found.\n");
        return null;
    }
    public void displayMenu(Student student){
        System.out.print("Hello, " + student.name + ". Following is the menu with the correspoinding prices.\n");
        for(int i = 0; i < 4; i++){
            System.out.print(menu[i].itemName + ": " + menu[i].price + "\n");
        }
        System.out.print("----------------------\n");
        System.out.print("What would you like to purchase?\n");
        String food = scan.nextLine();
        buyFood(getFood(food), student);
        System.out.print("Would you like to purchase more? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            displayMenu(student);
        }
        else if(input.equalsIgnoreCase("n")){
            System.out.print("Have a great day!\n");
        }
    }
    
}
