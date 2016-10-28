	import java.util.Scanner;

	public class CountWords {

		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Please enter a sentence: ");
			String sentence = scan.nextLine();
			
			
			int numWords = count(sentence);
			
			System.out.println("There are " + numWords + " words in the sentence.");
			
			scan.close();
		}
	
	
	//method for number of words
	public static int count(String sentence) {
		int switches = 0;
		sentence = sentence.trim();
		if (sentence.isEmpty()) {
			return 0;
		}
		
		for (int i = 0; i < sentence.length() - 1; i++) {
			
			char currentChar = sentence.charAt(i);
			char nextChar = sentence.charAt(i+1);
			
			char space = ' ';
			
			
			if ((currentChar == space) && (nextChar != space)) {
				switches++;
			}
			
			if ((currentChar != space) && (nextChar == space)) {
				switches++;
			}
			
			
		}
		
		return switches/2 + 1;			
		
		}
	}
	


