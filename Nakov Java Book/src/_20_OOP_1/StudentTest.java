package _20_OOP_1;

import java.util.Arrays;

public class StudentTest {

	
	
	public static void main(String[] args) {
		
		Student[] studentsArr = new Student[10];
		
		for(int i = 0; i < 10; i++) {
			studentsArr[i] = new Student("Ivan", "Petrov", 4.32);
		}
		studentsArr[3].setGrade(3.20);
		studentsArr[6].setGrade(6.00);
		
		Arrays.sort(studentsArr);
		
		for(Student student : studentsArr) {
			System.out.println(student);
		}
	
	}
	

}
