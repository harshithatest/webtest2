package Java.test;

public class reversewordsb {

	
	    public static void main(String[] args) {
	        String input = "ujar am I";
	        String[] words = input.split(" ");
	        StringBuilder reversed = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]).append(" ");
	        }

	        String output = reversed.toString().trim();
	        System.out.println(output);
	    }
	}

