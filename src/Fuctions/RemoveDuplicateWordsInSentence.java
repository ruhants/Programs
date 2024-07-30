package Fuctions;


public class RemoveDuplicateWordsInSentence {
	public static void main(String args[]) {

		String input = "Welcome to java java programming programming";
		System.out.println(input);
		String[] words = input.split(" ");

		// clean duplicates
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					if (i != j)
						words[i] = " ";
				}
			}
			System.out.print(words[i] + " ");
		}
	}
}
