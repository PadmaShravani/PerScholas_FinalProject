package CoreJava.MainEntryPoint;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

public class TestRunner {
    public static void main(String[] args) throws IOException {
        //Test Your Code Here!
    	StudentDAO sdao=new StudentDAO();
    	List<Student> slist=sdao.getStudents();
    	for(Student s:slist) {
    		System.out.println(s.getName()+","+s.getEmail()+","+s.getPass());
    	}
    	Student student=sdao.getStudentByEmail(slist,"joe@gmail.com");
    	System.out.println(student.getName()+","+student.getEmail()+","+student.getPass());
    	System.out.println(sdao.validateUser(slist, "tom@gmail.com", "tommyw2003"));
    	
    	CourseDAO cdao=new CourseDAO();
    	List<Course> clist=cdao.getAllCourses();
    	for(Course course : clist){
            System.out.printf("%-5s|%-25s|%-25s\n", course.getID(), course.getName(), course.getInstructor());
        }
    	
    	AttendingDAO adao=new AttendingDAO();
    	List<Attending> alist=adao.getAttending();
    	
    	adao.registerStudentToCourse(alist, "joe@gmail.com",2);
    	alist=adao.getAttending();
    	for(Attending a:alist) {
    		System.out.println(a.getCourseID()+","+a.getStudentEmail());
    	}
    	List<Course> cl=adao.getStudentCourses(clist, alist, "tom@gmail.com");
    	for(Course c:cl) {
    		System.out.printf("%-5s|%-25s|%-25s\n", c.getID(), c.getName(), c.getInstructor());
    	}
//    Attending a1=new Attending(10,"shravani@gmail.com");
//    Attending a2=new Attending(1,"tom@gmail.com");
//    List<Attending> list=new ArrayList<Attending>();
//    list.add(a1);
//    list.add(a2);
//    adao.saveAttending(list);
    	
    	
		}
    }

