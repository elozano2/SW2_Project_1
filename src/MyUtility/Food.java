

package MyUtility;

import java.util.Scanner;

public class Food {
    Scanner scan = new Scanner(System.in);
    
    public int price;
    public String itemName;
    //Food options for Sam's place
    public Food[] Sam = new Food[4];
    public void  setPrices_Sam(){
        Food hamburger = new Food();
        hamburger.itemName = "Hamburger";
        hamburger.price = 7;
        
        Food hotdog = new Food();
        hotdog.itemName = "Hot_Dog";
        hotdog.price = 4;
          
        Food fries = new Food();
        fries.itemName = "French_Fries";
        fries.price = 3;
        
        Food drink = new Food();
        drink.itemName = "Soda";
        drink.price = 2;
        
        Food chips = new Food();
        chips.itemName = "Chips";
        chips.price = 1;
        
        Sam[0] = hamburger;
        Sam[1] = hotdog;
        Sam[2] = fries;
        Sam[3] = drink;
        Sam[4] = chips;
    }
    //Food options for One Guy's Pizza
    public Food[] OneGuy = new Food[4];
    public void setPrices_Guy(){
        Food pizza  = new Food();
        pizza.itemName = "Pizza";
        pizza.price  = 14;
        
        Food pasta = new Food();
        pasta.itemName = "Spaghetti";
        pasta.price = 12;
        
        Food calzone = new Food();
        calzone.itemName = "Calzone";
        calzone.price = 8;
        
        Food tea = new Food();
        tea.itemName = "Tea";
        tea.price = 3;
        
        OneGuy[0] = pizza;
        OneGuy[1] = pasta;
        OneGuy[2] = calzone;
        OneGuy[3] = tea;
        
    }
    
    public Food[] Lou = new Food[4];
    public void setPrices_Lou(){
        Food brisket = new Food();
        brisket.itemName = "Brisket";
        brisket.price = 11;
        
        Food ribs = new Food();
        ribs.itemName = "Ribs";
        ribs.price = 15;
        
        Food turkey =  new Food();
        turkey.itemName =  "Turkey";
        turkey.price = 13;
        
        Food beer = new Food();
        beer.itemName = "Beer";
        beer.price  = 4;
        
        Lou[0] = brisket;
        Lou[1] = ribs;
        Lou[2] = turkey;
        Lou[3] = beer;
    }
    
    
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
        //Food food = new Food();
        for(int i = 0; i < 4; i++){
            if(menu[i].itemName.equalsIgnoreCase(itemName)){
                return menu[i];
            }
        }
        System.out.print("Food not found.\n");
        return null;
    }
    
    public Food getFoodSam(String itemName){
        for(int i = 0; i < 5; i++){
            if(Sam[i].itemName.equalsIgnoreCase(itemName)){
                return Sam[i];
            }
        }
        System.out.print("Food not found. \n");
        return null;
    }
    
    public Food getFoodGuy(String itemName){
        for(int i = 0; i < 4; i++){
            if(OneGuy[i].itemName.equalsIgnoreCase(itemName)){
                return OneGuy[i];
            }
        }
        System.out.print("Food not found.\n");
        return null;
    }
    
    public Food getFoodLou(String itemName){
        for(int i = 0; i < 4; i++){
            if(Lou[i].itemName.equalsIgnoreCase(itemName)){
                return Lou[i];
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
    
    public void displayMenuSam (Student student){
        System.out.print("Hello, " + student.name + ". Following is the menu with the corresponding prices. \n");
        for(int i = 0; i < 4; i++){
            System.out.print(Sam[i].itemName + ": " + Sam[i].price + "\n");
        }
        System.out.print("----------------------\n");
        System.out.print("What would you like to purchase?\n");
        String food = scan.nextLine();
        buyFood(getFoodSam(food), student);
        System.out.print("Would you like to purchase more? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            displayMenuSam(student);
        }
        else if (input.equalsIgnoreCase("n")){
            System.out.print("Have a great day!\n");
        }
    }
    
        public void displayMenuGuy (Student student){
        System.out.print("Hello, " + student.name + ". Following is the menu with the corresponding prices. \n");
        for(int i = 0; i < 4; i++){
            System.out.print(OneGuy[i].itemName + ": " + OneGuy[i].price + "\n");
        }
        System.out.print("----------------------\n");
        System.out.print("What would you like to purchase?\n");
        String food = scan.nextLine();
        buyFood(getFoodGuy(food), student);
        System.out.print("Would you like to purchase more? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            displayMenuGuy(student);
        }
        else if (input.equalsIgnoreCase("n")){
            System.out.print("Have a great day!\n");
        }
    }
        
            public void displayMenuLou (Student student){
        System.out.print("Hello, " + student.name + ". Following is the menu with the corresponding prices. \n");
        for(int i = 0; i < 4; i++){
            System.out.print(Lou[i].itemName + ": " + Lou[i].price + "\n");
        }
        System.out.print("----------------------\n");
        System.out.print("What would you like to purchase?\n");
        String food = scan.nextLine();
        buyFood(getFoodLou(food), student);
        System.out.print("Would you like to purchase more? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            displayMenuLou(student);
        }
        else if (input.equalsIgnoreCase("n")){
            System.out.print("Have a great day!\n");
        }
    }
}
