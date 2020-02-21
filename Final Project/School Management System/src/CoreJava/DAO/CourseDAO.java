package CoreJava.DAO;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
    public List<Course> getAllCourses() throws FileNotFoundException{
    	String location="C:\\Users\\Student\\eclipse-workspace\\Final Project\\courses.csv";
		File f=new File(location);
		Scanner input=new Scanner(f);
		ArrayList<Course> data=new ArrayList<Course>();
		while(input.hasNextLine()) {
			String[] line=input.nextLine().split(",");
			data.add(new Course(Integer.parseInt(line[0]),line[1],line[2]));
		}
		return data;		
		}
    
    }

