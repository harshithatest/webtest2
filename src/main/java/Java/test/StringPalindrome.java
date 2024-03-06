package Java.test;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Radar";
		String rev="";
		int strlength= str.length();
		for (int i = (strlength - 1); i >=0; --i) {
		      rev = rev + str.charAt(i);
		    }

		 if (str.toLowerCase().equals(rev.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		}

}
