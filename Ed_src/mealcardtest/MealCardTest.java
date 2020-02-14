//Software Engineering II Project
//Meal Plan Project
//Elijah Silang

package mealcardtest;

import java.util.Scanner;
import MyUtility.*;

public class MealCardTest {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        MyUtility.Student s = new MyUtility.Student();
        MyUtility.MealCard m = new MyUtility.MealCard();
        MyUtility.Food f = new MyUtility.Food();
        f.setPrices();
        String confirm = "y";
        while(confirm.equalsIgnoreCase("y")){
            System.out.print("Following are the available functions. What would you like to do today?\n");
            System.out.print("1. Buy food\n2. Add funds to card\n3. Add new student\n");
            int input = scan.nextInt();
            //System.out.print("Press Enter to continue...");
            scan.nextLine();
            
            if(input == 1){
                System.out.print("----------------------\n");
                System.out.print("Press Enter to continue...");
                scan.nextLine();
                System.out.print("Welcome to Sam's Place. Please enter your name to identify who will be making the purchase: ");
                String name = scan.nextLine();
                System.out.print("----------------------\n");
                Student customer = new Student();
                customer = s.getStudent(name);
                f.displayMenu(customer);
            }
            else if(input == 2){
                System.out.print("Please enter your name to identify whose account the funds will be added to: ");
                String name = scan.nextLine(); 
                Student customer = new Student();
                customer = s.getStudent(name);
                m.cardAdd(customer);
            }
        
            else if(input == 3){
                s.newStudent();
            }
            
            System.out.print("Would you like to continue? (Y/N)\n");
            confirm = scan.nextLine();
        }
        
        
    }
    
}
