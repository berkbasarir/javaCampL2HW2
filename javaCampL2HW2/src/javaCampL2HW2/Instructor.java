package javaCampL2HW2;

public class Instructor extends User {
	
	private String instructorNumber;
	private String course;
	
	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String instructorNumber, String course) {
		super(id, firstName, lastName);
		this.course = course;
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
