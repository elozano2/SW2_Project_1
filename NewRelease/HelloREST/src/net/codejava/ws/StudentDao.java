package net.codejava.ws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; import java.util.ArrayList;
import java.util.List;



public class StudentDao {
	public static List<Student> getAllStudents(){
		List<Student> studentList= null;
		 try {
			File file = new File("Students.dat"); 
			if (!file.exists()) {
			Student stud = new Student();
			stud.addstudent("mike", "11","11", 22);
			
			studentList = new ArrayList<Student>();
			studentList.add(stud);
			savestudentList(studentList);
	}
			else{
				FileInputStream fis = new FileInputStream(file); 
				ObjectInputStream ois = new ObjectInputStream(fis); 
				studentList = (List<Student>) ois.readObject(); ois.close();
				}
				} catch (IOException e) {
				e.printStackTrace();
				} catch (ClassNotFoundException e) {
				e.printStackTrace(); }
				return studentList; }
			



public static Student getStudent(String name){ 
	List<Student> students = getAllStudents();
for(Student stud: students){ if(stud.getName() == name){
return stud; }
}
return null; }


public static int addstudent(Student pUser, String name, String access, String address, int age){ 
	pUser.addstudent(name, access, address, age);
	
	List<Student> studentList = getAllStudents(); 
	boolean userExists = false;
	Student stud = new Student();
		if(stud.getStudent(name) == pUser){ userExists = true;
		} 
	if(!userExists){ studentList.add(pUser); 
	savestudentList(studentList); 
	return 1;
}
return 0; }



public static int updateStudent(Student pUser){ 
	List<Student> userList = getAllStudents();
for(Student user: userList){ 
	if(user.getName() == pUser.getName()){
	int index = userList.indexOf(user); 
	userList.set(index, pUser); savestudentList(userList);
	return 1;
} }
	return 0; 
}

public static int deleteStudent(String name){ List<Student> userList = getAllStudents();
for(Student user: userList){ 
	if(user.getName() == name){
	int index = userList.indexOf(user); 
	userList.remove(index); 

savestudentList(userList);
return 1;
} }
return 0; } 





private static void savestudentList(List<Student> userList){ 
	try {
File file = new File("Students.dat");
FileOutputStream fos;
fos = new FileOutputStream(file);
 
ObjectOutputStream oos = new ObjectOutputStream(fos); 
oos.writeObject(userList);
oos.close();
} catch (FileNotFoundException e) { e.printStackTrace();
} catch (IOException e) { e.printStackTrace();
} }
}









