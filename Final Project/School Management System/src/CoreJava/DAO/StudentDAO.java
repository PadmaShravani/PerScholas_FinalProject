package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
    public List<Student>  getStudents() throws FileNotFoundException{
   
    	String location="C:\\Users\\Student\\eclipse-workspace\\Final Project\\students.csv";
		File f=new File(location);
		Scanner input=new Scanner(f);
		ArrayList<Student> data=new ArrayList<Student>();
		while(input.hasNextLine()) {
			String[] line=input.nextLine().split(",");
			data.add(new Student(line[0],line[1],line[2]));
		}		
		return data;
		}
		
    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
    	Student sobj=new Student();
    	for(Student s:studentList) {
    		if(s.getEmail().equals(studentEmail)) {
    			sobj.setEmail(s.getEmail());
    			sobj.setName(s.getName());
    			sobj.setPass(s.getPass());
    		}
    	}
    	
		return sobj;

    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
    	boolean b=false;
    	for(Student s:studentList) {
    		if((s.getEmail().equals(studentEmail))&&(s.getPass().equals(studentPass))) {
    			b=true;
    			break;    
    		}
    	}
    	return b;

    }
}
