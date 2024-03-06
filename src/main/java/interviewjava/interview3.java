package interviewjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "my name is harshitha 123";
        String[] words = input.split(" ");

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            if (!isNumeric(word)) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                System.out.println(reversedWord);
                reversedString.append(reversedWord).append(" ");
            } else {
                reversedString.append(word).append(" ");
            }
        }

        String output = reversedString.toString().trim();
        System.out.println(output);
    }

	private static boolean isNumeric(String word) {
		// TODO Auto-generated method stub
		try {
			Integer.parseInt(word);
			
			return true;
		}catch(Exception e) {
				return false;
	}}

	
	}


