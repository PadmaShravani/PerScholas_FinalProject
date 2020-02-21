package CoreJava.Models;

public class Student {
	private String email,name,pass;
	
	public Student() {}
	
    public Student(String email, String name, String pass) {
		super();
		this.email = email;
		this.name = name;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
}
