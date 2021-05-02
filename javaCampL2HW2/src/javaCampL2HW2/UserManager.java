package javaCampL2HW2;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Eklenen kişi: " + user.getFirstName());
	}
	
	public void update(User user) {
		System.out.println("Güncellenen kişi: " + user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Silinen kişi: " + user.getFirstName());
	}


}
