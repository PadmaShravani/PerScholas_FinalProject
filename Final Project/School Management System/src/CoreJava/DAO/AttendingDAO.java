package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {
// this a dao file
    public List<Attending> getAttending() throws FileNotFoundException{
    	String location="C:\\Users\\Student\\eclipse-workspace\\Final Project\\attending.csv";
		File f=new File(location);
		Scanner input=new Scanner(f);
		ArrayList<Attending> data=new ArrayList<Attending>();
		while(input.hasNextLine()) {
			String[] line=input.nextLine().split(",");
			data.add(new Attending(Integer.parseInt(line[0]),line[1]));
		}
		//input.close();
		return data;		
		}
    

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID) throws IOException{
    	//Attending aobj=new Attending();
    	int found=0;
    	for(Attending a:attending) {
    		if(((a.getStudentEmail().equals(studentEmail))&&(a.getCourseID()==courseID))) {
    			found=1;
    			System.out.println("Already registered for this course");
    			break;
    		}
    		}
    	if(found!=1) {
    			String location="C:\\Users\\Student\\eclipse-workspace\\Final Project\\attending.csv";
    			File f=new File(location);
    			FileWriter writer=new FileWriter(f,true);
    			Attending a1=new Attending(courseID,studentEmail);
    			writer.write(String.format("\n%d,%s",a1.getCourseID(),a1.getStudentEmail()));
    			writer.close();
    			System.out.println("Added course");
    		}  			
  		}
    
    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
    List<Course> clist=new ArrayList<Course>();
    	for(Attending a:attending) {
    		if(a.getStudentEmail().equals(studentEmail)) {
    			for(Course c:courseList) {
    				if(a.getCourseID()==c.getID()) {
    					clist.add(c);
    				}
    			}
    		}
    	}
    	
    	return clist;

    }

    public void saveAttending(List<Attending> attending) throws IOException{
    	
    	String location="C:\\Users\\Student\\eclipse-workspace\\Final Project\\attending.csv";
		File f=new File(location);
		FileWriter writer=new FileWriter(f,false);
		for(Attending a:attending) {
		writer.write(String.format("\n%d,%s",a.getCourseID(),a.getStudentEmail()));
		}
		writer.close();
    }

}
