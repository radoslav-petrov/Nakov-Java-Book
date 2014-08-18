package _20_OOP_1;

public class Student extends Human implements Comparable<Student> {

	private double grade = 0;

	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}	
	
	public Student(String firstName, String lastName) {
		//super(firstName, lastName);
		this(firstName, lastName, 0.0);
	}
	public Student(String firstName, String lastName, double grade) {
		super(firstName, lastName);
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.grade > o.grade) {
			return 1;
		} else {
			if(this.grade == o.grade) 
			{
				return 0;
			} else {
				return -1;
			}
		}
	}
	
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + ": " + this.grade;
	}
	
	
}
