package CoreJava.Models;

public class Course {
	private int ID;
	private String name,instructor;
 
	public Course() {
		super();
	}
    
	public Course(int iD, String name, String instructor) {
		super();
		ID = iD;
		this.name = name;
		this.instructor = instructor;
	}

	public void setID(int ID){
		this.ID=ID;
    }

    public int getID(){
		return ID;

    }

    public void setName(String name){
    	this.name=name;
    }

    public String getName(){
    	return name;
    }

    public void setInstructor(String instructor){
    	this.instructor=instructor;
    }

    public String getInstructor(){
    	return instructor;
    }

}
