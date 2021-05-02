package javaCampL2HW2;

public class StudentManager extends UserManager {
	
	public void registerCourse(Student student) {
		System.out.println("Kursa kayıt olundu: " + student.getCourse());
	}

}
