package net.codejava.ws;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import net.codejava.ws.Item;
import java.util.List;
import java.io.IOException;
import net.codejava.ws.Student;
import javax.servlet.http.HttpServletResponse;
@Path("/bonjour")
public class HelloResource {
	private static final String SUCCESS_RESULT="<result>success</result>";
	private static final String FAILURE_RESULT="<result>failure</result>";

	@ GET
	@ Path("/students")
	@ Produces(MediaType.APPLICATION_XML) 
	public List<Student> getStudents(){
	return StudentDao.getAllStudents();
	}

	
	@ GET
	@ Path("/students/stud")
	@ Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("name") String name){
	return StudentDao.getStudent(name); }
	
	@ PUT
	@ Path("/students")
	@ Produces(MediaType.APPLICATION_XML) 
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String createStudent(@FormParam("name") String name,
	@FormParam("access") String access,
	@FormParam("address") String address,@FormParam("age") int age,
	@Context HttpServletResponse servletResponse) throws IOException{ 
		Student user = new Student();
		user.addstudent(name, access, address, age);
	int result = Student.checkStudent(name);
	if(result == 1){
	return SUCCESS_RESULT; }
	return FAILURE_RESULT; }	
	 
	@ POST
	@ Path("/students")
	@ Produces(MediaType.APPLICATION_XML) 
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String updateStudent(@FormParam("name") String name,
	@FormParam("access") String access,@FormParam("address") String address, @FormParam("age") int age,
	 
	@Context HttpServletResponse servletResponse) throws IOException{ 
		Student user = new Student();
		user.addstudent(name, access, address, age);
	int result = StudentDao.updateStudent(user);
	if(result == 1){
	return SUCCESS_RESULT; }
	return FAILURE_RESULT; }
	
	
	@DELETE
	@ Path("/students/stud")
	@ Produces(MediaType.APPLICATION_XML)
	public String deleteStudent(@PathParam("name") String name){
	int result = StudentDao.deleteStudent(name);
	if(result == 1){
	return SUCCESS_RESULT; }
	return FAILURE_RESULT; }
	
	
	@OPTIONS
	@ Path("/students")
	@ Produces(MediaType.APPLICATION_XML) public String getSupportedOperations(){
	return "<operations>GET, PUT, POST, DELETE</operations>"; }
	
	
	


}