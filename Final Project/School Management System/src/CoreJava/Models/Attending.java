package CoreJava.Models;

public class Attending {
	private int courseID;
	private String studentEmail;
	

    public Attending() {
		super();
		
	}

	public Attending(int courseID, String studentEmail) {
		super();
		this.courseID = courseID;
		this.studentEmail = studentEmail;
	}

	public int getCourseID() {
		return courseID;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	
}
