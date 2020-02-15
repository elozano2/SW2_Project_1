//HW3: Meal Card Test
//Elijah Silang CS 2365
//7-29-2019

package mealcardtest;

import java.util.Scanner;
import MyUtility.*;

public class MealCardTest {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        MyUtility.Student s = new MyUtility.Student();
        MyUtility.MealCard m = new MyUtility.MealCard();
        MyUtility.Food f1 = new MyUtility.Food();
        MyUtility.Food f2 = new MyUtility.Food();
        MyUtility.Food f3 = new MyUtility.Food();
        f1.setPrices_Sam();
        f2.setPrices_Guy();
        f3.setPrices_Lou();
        String confirm = "y";
        while(confirm.equalsIgnoreCase("y")){
            System.out.print("Following are the available functions. What would you like to do today?\n");
            System.out.print("1. Buy food\n2. Add funds to card\n3. Add new student\n");
            int input = scan.nextInt();
            //System.out.print("Press Enter to continue...");
            scan.nextLine();
            
            if(input == 1){
                System.out.print("----------------------\n");
                System.out.print("Where would you like to purchase food from?\n");
                System.out.print("1. Sam's Place\n2. One Guy's Pizza\n3. Lou's BBQ\n");
                int input_rest = scan.nextInt();
                scan.nextLine();
                
                if(input_rest == 1){
                    System.out.print("Welcome to Sam's Place. Please enter your name to identiy who will be making the purchase: ");
                    String name = scan.nextLine();
                    System.out.print("----------------------\n");
                    Student customer  = new Student();
                    customer  = s.getStudent(name);
                    f1.displayMenuSam(customer);
                }
                else if(input_rest == 2){
                    System.out.print("Welcome to One Guy's Pizza. Please enter your name to identiy who will be making the purchase: ");
                    String name = scan.nextLine();
                    System.out.print("----------------------\n");
                    Student customer  = new Student();
                    customer  = s.getStudent(name);
                    f2.displayMenuGuy(customer);
                }
                else if(input_rest == 3){
                    System.out.print("Welcome to Lou's BBQ. Please enter your name to identiy who will be making the purchase: ");
                    String name = scan.nextLine();
                    System.out.print("----------------------\n");
                    Student customer  = new Student();
                    customer  = s.getStudent(name);
                    f3.displayMenuLou(customer);
                }
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
