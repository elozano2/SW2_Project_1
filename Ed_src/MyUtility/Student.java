//Software Engineering II Project
//Meal Plan Project
//Elijah Silang

package MyUtility;

import java.util.Scanner;

public class Student {
    Scanner scan = new Scanner(System.in);
    public int count = 0;
    public String name;
    public String address;
    public int age;
    public MealCard card = new MealCard();
    public Student[] roster = new Student[50];
    public void newStudent(){
        Student newStudent = new Student();
        System.out.print("Please input the name of the new student: ");
        newStudent.name = scan.nextLine();
      
        roster[count++] = newStudent;
        
        System.out.print("Please input the address of the new student: ");
        newStudent.address = scan.nextLine();
        System.out.print("Please input the age of the new student: ");
        newStudent.age = scan.nextInt();
        card.cardIssue(newStudent);
        scan.nextLine();
        
    }
    public Student getStudent(String name){
        for(int i = 0; i < count; i++){
            if(roster[i].name.contains(name)){
                return roster[i];
            }
        }
        System.out.print("Student not found.\n");
        return null;
    }
}
