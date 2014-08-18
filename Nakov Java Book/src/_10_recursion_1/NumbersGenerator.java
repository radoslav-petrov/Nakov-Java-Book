package _10_recursion_1;

import java.util.Scanner;

public class NumbersGenerator {
	
	public static String result = "";
	
	public static int n = 3;
	public static int k = 3;
	public static int[] Loops;
	public static boolean duplicate = false;
	
	
	public static void main(String[] args) {
		
	/*	Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		if(input.hasNextInt()) {
			n = input.nextInt();
		}
		System.out.print("k = ");
		if(input.hasNextInt()) {
			k = input.nextInt();
		}
		input.close();
	*/

		Loops = new int[k];
		nestedLoops(0);
	

	}
	
	public static void nestedLoops(int currentLoop) {
		if(currentLoop == k) {
			printLoops();
			return;
		}
		for(int i = 1; i <= n; i++) {
			Loops[currentLoop] = i;
			nestedLoops(currentLoop + 1);
		}
	}
	
	public static void printLoops() {
		removeDuplicates();
		if(!duplicate) {
			System.out.print("( ");
			for(int i = 0; i < k; i++) {
				System.out.printf("%d ", Loops[i]);
			}
			System.out.print("), ");
		}
	}
	
	public static void removeDuplicates() {
		duplicate = false;
		for(int j = k-1; j > 0; j--) {
			if(Loops[j] < Loops[j-1])
				duplicate = true;
		}
	}
	
	

}
