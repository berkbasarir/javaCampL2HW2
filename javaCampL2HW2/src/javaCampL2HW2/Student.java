package javaCampL2HW2;

public class Student extends User {
	
	private String studentNumber;
	private String course;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String studentNumber, String course) {
		super(id, firstName, lastName);
		this.course = course;
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	


}
