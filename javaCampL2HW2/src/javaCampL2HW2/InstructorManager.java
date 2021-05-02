package javaCampL2HW2;

public class InstructorManager extends UserManager {
	
	public void createCourse(Instructor instructor) {
		System.out.println("Yeni kurs yaratıldı: " + instructor.getCourse());
	}

}
