package mealcardtest;

import java.util.Scanner;
import net.codejava.ws.*;

public class MealCardTest {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        net.codejava.ws.Student s = new  net.codejava.ws.Student();
        net.codejava.ws.MealCard m = new  net.codejava.ws.MealCard();
        net.codejava.ws.Permissions p = new  net.codejava.ws.Permissions();
        net.codejava.ws.Food f1 = new  net.codejava.ws.Food();
        net.codejava.ws.Food f2 = new  net.codejava.ws.Food();
        net.codejava.ws.Food f3 = new  net.codejava.ws.Food();
        net.codejava.ws.Item k= new  net.codejava.ws.Item();
        f1.setPrices_Sam();
        f2.setPrices_Guy();
        f3.setPrices_Lou();
        k.setPrices();
        String confirm = "y";
        while(confirm.equalsIgnoreCase("y")){
            System.out.print("Following are the available functions. What would you like to do today?\n");
            System.out.print("1. Buy food\n2. Buy item\n3. Add funds to card\n4. Add new student\n5. View or change the permissions of a student\n");
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
                System.out.print("----------------------\n");
                System.out.print("Press Enter to continue...");
                scan.nextLine();
                System.out.print("Welcome to the SUB Barnes and Noble. Please enter your name to identify who will be making the purchase: ");
                String name = scan.nextLine();
                System.out.print("----------------------\n");
                Student customer = new Student();
                customer = s.getStudent(name);
                k.display_Menu(customer);
            }
           else if(input == 3){
                System.out.print("Please enter your name to identify whose account the funds will be added to: ");
                String name = scan.nextLine(); 
                Student customer = new Student();
                customer = s.getStudent(name);
               System.out.print("1.MealCard Deposit\n2.RaiderCash Deposit\n ");
                int num = scan.nextInt(); 
                if(num ==1){
                m.cardAdd(customer);}
                else if(num==2)
                {
                m.AddRaiderCash(customer);
                }
                scan.nextLine();
            }
        
            else if(input == 4){
                
           	 System.out.print("Please enter the name of the student: \n");
           	 String name = scan.nextLine();
        	 System.out.print("Please enter the access of the student: \n");
        	 String access = scan.nextLine();	
        	 System.out.print("Please enter the address of the student: \n");
        	 String address = scan.nextLine();	
        	 System.out.print("Please enter the age of the student: \n");
        	 String age = scan.nextLine();	
        	 int age2 = Integer.parseInt(age);
        	 
        	 
            	s.addstudent(name, access, address, age2);
            }
           // Steven did everything in input 5
            else if(input == 5) {
            	 System.out.print("Please enter the name of the student: \n");
            	 String name = scan.nextLine();
               //Checks to see if person exists or not
            	 Student customer = new Student();
            	 customer = s.getStudent(name);
            	 p.Perm(customer);
             }
            else{
                System.out.print("Invalid Input \n");
            }
            
            System.out.print("Would you like to continue? (Y/N)\n");
            confirm = scan.nextLine();
        }
        
        
    }
    
}