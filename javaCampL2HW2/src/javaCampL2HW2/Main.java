package javaCampL2HW2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Bisou");
		user1.setLastName("Yuksel");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setInstructorNumber("236547");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setCourse("Java Kamp Eğitmen");
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setStudentNumber("8974568");
		student1.setFirstName("Berk");
		student1.setLastName("Başarır");
		student1.setCourse("Java Kamp Öğrenci");
		
		
		System.out.println("----UserManager----");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.update(user1);
		userManager.delete(user1);
		
		System.out.println("----InstructorManager----");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.update(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.createCourse(instructor1);
		
		System.out.println("----StudentManager----");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		studentManager.registerCourse(student1);

	}

}
