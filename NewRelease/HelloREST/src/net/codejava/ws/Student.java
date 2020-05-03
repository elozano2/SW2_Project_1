package net.codejava.ws;

import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student {
   
    public static int count = 0;
    public String name;
    public String access;
    public String address;
    public int age;

	public Student() {
	    String name;
	    String access;
	    String address;
	    int age;
	}
	public String getName() {
		return name;
	}
    @XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getAccess() {
		return access;
	}
	@XmlElement
	public void setAccess(String access) {
		this.access = access;
	}

	public String getAddress() {
		return address;
	}
	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
	public MealCard card = new MealCard();
    public static Student[] roster = new Student[50];
    
    public void addstudent( String name, String access, String address, int age) {
		Student newStudent = new Student();
		roster[count++]= newStudent;
		this.name=newStudent.name; 
		this.access=newStudent.access;
		this.address=newStudent.address; 
		this.age=newStudent.age;
		card.cardIssue(newStudent);
	
		
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
    public static int checkStudent(String name){
        for(int i = 0; i < count; i++){
            if(roster[i].name.contains(name)){
                return 1;
            }
        }
        System.out.print("Student not found.\n");
        return 0;
    }

}
