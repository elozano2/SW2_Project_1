package net.codejava.ws;

import java.util.Scanner;


public class Permissions{
	//scan for loop Nscan for else if. you have to use both at the same time. 
	Scanner scan = new Scanner(System.in);
	Scanner Nscan = new Scanner(System.in);
    public int choice = 0;
	public void Perm(Student customer) {
		while (choice != 3) {
			System.out.print("Choose '1' to view a students permissions, '2' to update a students permissions or '3' to exit: \n");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.print(customer.access + "\n");
			}	
			else if (choice == 2) {
				System.out.print("Please enter the permissions you wish the student to have inculding old ones: ");
				customer.access = Nscan.nextLine();
			}
		}
	}
}