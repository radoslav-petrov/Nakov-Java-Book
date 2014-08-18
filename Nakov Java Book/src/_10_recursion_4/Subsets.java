package _10_recursion_4;

public class Subsets {

	public static int k = 0;
	public static String[] words;
	public static int numOfWords;
	public static int wordsIndexes[];
	public static boolean duplicate;
	
	public static void main(String[] args) {
		
		words = new String[] {"test", "rock", "fun"};
		numOfWords = 3;
		wordsIndexes = new int[numOfWords];
		
		for(int j = 1; j <= numOfWords; j++) {
			k = j;
			System.out.print("(  ), ");
			generateStringInd(0);
		}
	}
	
	public static void generateStringInd(int currentIndex) {
		if(currentIndex == k) {
			removeDuplicate();
			printString();
			return;
		}
		for(int i = 0; i < numOfWords; i ++) {
			wordsIndexes[currentIndex] = i;
			generateStringInd(currentIndex + 1);
		}
	}

	public static void printString() {
		if(!duplicate) {
			System.out.print("( ");
			for(int i = 0; i < k; i++) {
				System.out.printf("%s ", words[wordsIndexes[i]]);
			}
			System.out.print("), ");
		}
	}
	public static void removeDuplicate() {
		duplicate = false;
		for(int i = k-1; i > 0; i--) {
			if(wordsIndexes[i] <= wordsIndexes[i-1])
				duplicate = true;
		}
		
	}
	
	
}
