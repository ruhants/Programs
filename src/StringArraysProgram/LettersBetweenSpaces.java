package StringArraysProgram;

public class LettersBetweenSpaces {
	public static void main(String[] args) {
        String input = "rohan";
        String result = addSpaceToEveryCharacter(input);
        System.out.println(result);  
    }

    public static String addSpaceToEveryCharacter(String input) {
        StringBuilder spacedString = new StringBuilder();
        for (char c : input.toCharArray()) {
            spacedString.append(c).append(" ");
        }
        return spacedString.toString();
    }

}
