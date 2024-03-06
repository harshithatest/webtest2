package interviewjava;

public class printDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcdba";//output ab
		for(int i=str.length()-1; i>=0; i--) {
			for (int j=i-1; j>=0; j--) {
				if(str.charAt(i)== str.charAt(j)) {
					System.out.print(str.charAt(j));
				}
			}
		}
		
	}

}
