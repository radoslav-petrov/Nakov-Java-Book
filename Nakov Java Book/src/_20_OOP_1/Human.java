package _20_OOP_1;

public class Human {
	
	private String firstName = null;
	private String lastName = null;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Human(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

}
