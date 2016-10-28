	import java.util.Scanner;

	public class CountWords {

		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Please enter a sentence: ");
			String sentence = scan.nextLine();
			count(sentence);
			//int numWords = count(sentence);
			//System.out.println("There are " + numWords + " words in the sentence.");
			
			scan.close();
		}
	
	
	//method for number of words
	public static void count(String sentence) {
		for (int i = 0; i < sentence.length(); i++) {
			int wordCount = 0;
			char currentChar = sentence.charAt(i);
			char nextChar = sentence.charAt(i+1);
			System.out.println(currentChar);
			char space = ' ';
			if (sentence.startsWith(" ")) {
				wordCount += 1;
			}
			
			if ((sentence.charAt(i) == space) && (sentence.charAt(i-1) != space)) {
				wordCount = wordCount + 1;
			}
			
			
			
		}
		}
	}
	


