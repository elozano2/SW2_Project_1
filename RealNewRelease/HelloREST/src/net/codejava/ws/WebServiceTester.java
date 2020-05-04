package net.codejava.ws;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder; import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType; import javax.ws.rs.core.MediaType;

public class WebServiceTester {
private Client client;
private String REST_SERVICE_URL = "http://localhost:8080/HelloREST/rest/bonjour/students";
private static final String SUCCESS_RESULT="<result>success</result>"; 
private static final String PASS = "pass";
private static final String FAIL = "fail";
private void init(){
this.client = ClientBuilder.newClient();}
public static void main(String[] args){ 
	WebServiceTester tester = new WebServiceTester();
//initialize the tester
tester.init();

tester.testUpdateStudent();

tester.testAddStudent();

tester.testGetAllStudents();

tester.testGetStudent();



//test delete user Web Service Method
 
tester.testDeleteStudent(); }



private void testAddStudent() {
	Form form = new Form();
	form.param("name", "michael");
	form.param("access", "W");
	form.param("address", "123");
	form.param("age", "222");
	

	String callResult = client 
			.target(REST_SERVICE_URL) 
			.request(MediaType.APPLICATION_XML) 
			.post(Entity.entity(form ,
MediaType.APPLICATION_FORM_URLENCODED_TYPE),
String.class);
	
String result = PASS;
if(!SUCCESS_RESULT.equals(callResult)){ 
	result = FAIL;
	}
	System.out.println("Test case name: testAddStudent, Result: " + result ); 
	}
	





private void testGetAllStudents(){
GenericType<List<Student>> list = new GenericType<List<Student>>() {};
List<Student> stud = client
	.target(REST_SERVICE_URL)
	.request(MediaType.APPLICATION_XML) 
	.get(list);
String result = PASS; 
if(stud==null){
result = FAIL; }
System.out.println("Test case name: testGetAllUsers, Result: " + result ); }



private void testGetStudent(){
Student sampleStudent = new Student();
sampleStudent.addstudent("will","1", "123", 22);
Student user = client 
	.target(REST_SERVICE_URL) 
	.path("/stud") 
	.resolveTemplate("stud", "will") 
	.request(MediaType.APPLICATION_XML) 
	.get(Student.class);
String result = FAIL;
if(sampleStudent != null && sampleStudent.getName() == user.getName()){
result = PASS; }
System.out.println("Test case name: testGetUser, Result: " + result ); }


private void testUpdateStudent() {
	Form form = new Form();
	form.param("name", "will");
	form.param("access", "W");
	form.param("address", "123");
	form.param("age", "222");
	

	String callResult = client 
			.target(REST_SERVICE_URL) 
			.request(MediaType.APPLICATION_XML) 
			.post(Entity.entity(form ,
MediaType.APPLICATION_FORM_URLENCODED_TYPE),
String.class);
	
String result = PASS;
if(!SUCCESS_RESULT.equals(callResult)){ 
	result = FAIL;
	}
	System.out.println("Test case name: testUpdateStudent, Result: " + result ); 
	}
	





private void testDeleteStudent(){ 
String callResult = client
.target(REST_SERVICE_URL) 
.path("/stud") .
resolveTemplate("stud", "michael") 
.request(MediaType.APPLICATION_XML) 
.delete(String.class);
String result = PASS;
if(!SUCCESS_RESULT.equals(callResult)){
result = FAIL; }
System.out.println("Test case name: testDeleteStudent, Result: " + result ); }
}










