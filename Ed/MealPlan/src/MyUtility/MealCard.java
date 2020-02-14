//HW3: Meal Card Test
//Elijah Silang CS 2365
//7-29-2019

package MyUtility;

import java.util.Scanner;

public class MealCard {
    Scanner scan = new Scanner(System.in);
    public int balance;
    public void cardIssue(Student student){
        System.out.print("Would you like to specify a meal plan amount? (Y/N)\n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            System.out.print("How much points would you like to give to " + student.name + "'s meal plan?\n");
            student.card.balance = scan.nextInt();
            System.out.print(student.card.balance + " points have been given to " + student.name + ".\n");
        }
        else if(input.equalsIgnoreCase("n")){
            student.card.balance = 100;
            System.out.print("Default balance of " + student.card.balance + " points have been given to " + student.name + ".\n");
            System.out.print("Press Enter to continue...");
        }
        else{
            System.out.print("Invalid input. Please try again.\n");
            cardIssue(student);
        }
        scan.nextLine();
    }
    public void cardAdd(Student student){
        System.out.print("How many points would you like to add to your account?\n");
        int balanceAdd = scan.nextInt();
        student.card.balance += balanceAdd;
        System.out.print(student.name + "'s balance is now " + student.card.balance + ".\n");
    }
    
}
