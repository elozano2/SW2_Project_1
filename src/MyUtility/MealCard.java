
package MyUtility;

import java.util.Scanner;

public class MealCard {
    Scanner scan = new Scanner(System.in);
    public int balance;
    public double rcbalance;
    public void cardIssue(Student student){
        //Choosing a meal plan
        System.out.print("Would you like to specify a meal plan amount and RaiderCash amount? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            System.out.print("How much points would you like to give to " + student.name + "'s meal plan?\n");
            student.card.balance = scan.nextInt();
            System.out.print(student.card.balance + " points have been given to " + student.name + ".\n");
            System.out.print("How much RaiderCash would you like to give to " + student.name + "?\n");
            student.card.rcbalance = scan.nextInt();
            System.out.print(student.card.rcbalance + " points have been given to " + student.name + ".\n");
       
        }
        //Setting automatic amount for the student's balance
        else if(input.equalsIgnoreCase("n")){
            student.card.balance = 100;
            student.card.rcbalance = 100;
            System.out.print("Default balance of " + student.card.balance + " points have been given to " + student.name + ".\n");
            System.out.print("Default balance of " + student.card.rcbalance + " RaiderCash have been given to " + student.name + ".\n");
            System.out.print("Press Enter to continue...");
        }
        else{
            //prints out error
            System.out.print("Invalid input. Please try again.\n");
            cardIssue(student);
        }
        scan.nextLine();
    }
    public void cardAdd(Student student){
        //Adds points to student's account
        System.out.print("How many points would you like to add to your account?\n");
        int balanceAdd = scan.nextInt();
        student.card.balance += balanceAdd;
        System.out.print(student.name + "'s balance is now " + student.card.balance + ".\n");
    }
    //Adds Raider Cash to student's account
    public void AddRaiderCash(Student student){
        System.out.print("How much RaiderCash would you like to add to your account?\n");
        int balanceAdd = scan.nextInt();
        student.card.rcbalance += balanceAdd;
        System.out.print(student.name + "'s balance is now " + student.card.rcbalance + ".\n");
        scan.nextLine();
    }
    
}
