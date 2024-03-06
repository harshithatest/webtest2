package interviewjava;

public class PrintUpLowercases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		           String str = "My nAme iS John";
		           System.out.println("Uppercase");
		 for(int i=0; i<str.length(); i++) {
			 char c=str.charAt(i);
			 if(Character.isUpperCase(c)) {
				
				 System.out.print(c);
			 }
		           }
		 System.out.println();
		 System.out.println("lowercase");
		 for(int j=0; j<str.length(); j++) {
			 char c=str.charAt(j);
			 if(Character.isLowerCase(c)) {
				 System.out.print(c);
			 }
		 }
	}

}
