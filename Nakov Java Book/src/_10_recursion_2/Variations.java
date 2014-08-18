package _10_recursion_2;

public class Variations {
	
	public static int n = 3;
	public static int k = 2;
	public static int Loop[];
	
	
	public static void main(String[] args) {
		
		Loop = new int[k];
		nestedLoops(0);
	}
	
	public static void nestedLoops(int currentIndex) {
		if(currentIndex == k) {
			printLoop();
			return;
		}
		for(int i = 1; i <= n; i++) {
			Loop[currentIndex] = i;
			nestedLoops(currentIndex + 1);
		}
		
	}
	
	public static void printLoop() {
		System.out.print("( ");
		for(int i = 0; i < k; i++) {
			System.out.printf("%d ", Loop[i]);
		}
		System.out.print("), ");		
	}
	
	
	

}
