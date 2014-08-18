package _20_OOP_1;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorkerTest {

	public static void main(String[] args) {
		
		Worker[] workerArr = new Worker[10];
		
		for(int i = 0; i < 10; i++) {
			workerArr[i] = new Worker("Petyr", "Ivanov", BigDecimal.valueOf(45.50), 8.0);
		}
		workerArr[2].setFirstName("Milen");
		workerArr[2].setWage(BigDecimal.valueOf(56.00));
		workerArr[7].setWage(BigDecimal.valueOf(88.00));
		workerArr[9].setWage(BigDecimal.valueOf(10.00));
		
		Arrays.sort(workerArr);
		
		for(Worker man : workerArr) {
			System.out.println(man);
		}
		
	}
	
}
